export class KeyStore {
  name: string;
  password: string;
  aliases: string[];
  date: string;
}
export class Certificate {
  commonName: string;
  surname: string;
  orgName: string;
  givenName: string;
  country: string;
  email: string;
  isCa: boolean;
  uid: string;
  serialNumber: string;
}