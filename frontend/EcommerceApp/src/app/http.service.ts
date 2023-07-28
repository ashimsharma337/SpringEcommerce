import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';


@Injectable({
  providedIn: 'root'
})
export class HttpService {
 
  private backend_url = "http://localhost:8000";

  constructor(
    private http: HttpClient
  ) { }

  getProducts(){
    return this.http.get(this.backend_url+"/products");
  }
}
