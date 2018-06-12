import { Component, OnInit } from '@angular/core';
import {AditionalServices, City, Lodging} from '../model';
import {LodgingService} from '../lodging.service';

@Component({
  selector: 'app-lodging-new',
  templateUrl: './lodging-new.component.html',
  styleUrls: ['./lodging-new.component.css']
})
export class LodgingNewComponent implements OnInit {
  lodging: Lodging;
  cities: City[];
  categories: any[];
  types: any[];
  aditionServices:  AditionalServices[];

  nizCekiranih: number[];
  cekiraniSlanje: number[];

  constructor(private lodgingService: LodgingService) {
    this.lodging = new Lodging();
    this.nizCekiranih = [];
    this.cekiraniSlanje = [];
  }

  ngOnInit() {
    this.getCities();
    this.getCategories();
    this.getTypes();
    this.getAditionalServices();
  }

  createLodging() {
    this.lodging.additionService = this.nizCekiranih;
    this.lodgingService.createLodging(this.lodging)
      .subscribe();
  }
  getCities() {
    this.lodgingService.getCities()
      .subscribe((response: City[]) => {
        this.cities = response;
      });
  }
  getCategories() {
    this.lodgingService.getCategories()
      .subscribe((response: any[]) => {
        this.categories = response;
      });
  }
  getTypes() {
    this.lodgingService.getTypes()
      .subscribe((response: any[]) => {
        this.types = response;
      });
  }

  getAditionalServices() {
    this.lodgingService.getAdditionalServices()
      .subscribe((response: AditionalServices[]) => {
        this.aditionServices = response;
      });
  }

  vrati(id: number) {
    const text = document.getElementById('text');
    console.log('check');
    const element: HTMLInputElement =  <HTMLInputElement>document.getElementById(id.toString());
    const isChecked = element.checked;
    if (element.checked === true) {
      //  text.style.display = 'block';

      this.nizCekiranih.push(id);

    } else {
      for (let i = 0 ; i < this.nizCekiranih.length ; i++ ) {
        if (this.nizCekiranih[i] === id ) {
          console.log('brisem iz liste ' + id + ' na poziciji ' + i);
          this.nizCekiranih.splice(i, 1);
          console.log('duzina liste ' + this.nizCekiranih.length);
        }
      }
    }

  }




}
