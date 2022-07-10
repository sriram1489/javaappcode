import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable()
export class HomeService {
  private baseUrl: string = "http://localhost:8080";

  constructor(private http: HttpClient) { }

  public getCustomers(): Observable<any> {
    return this.http.get(`${this.baseUrl}/customers`);
  }

}
