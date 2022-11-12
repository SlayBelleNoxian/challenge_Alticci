import { Injectable } from '@angular/core';
import { HttpClient,HttpHeaders } from "@angular/common/http";
import { Observable } from "rxjs";

@Injectable({
  providedIn: 'root'
})
export class ApiserviceService {

  constructor(private http: HttpClient) { }

  buildHttpOptions(): any {
    return {
        headers: new HttpHeaders({
            "Content-Type": "application/json"
        }),
        observe: "response" as "response"
    }
}

  getData(value:string):Observable<any> {
    return this.http.get('http://127.0.0.1:8080/alticci/'+value)
  }
}
