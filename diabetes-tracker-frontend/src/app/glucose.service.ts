import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class GlucoseService {
  private apiUrl = 'http://localhost:8081/api/glucose';

  constructor(private http: HttpClient) { }

  getAllReadings(): Observable<any> {
    return this.http.get(`${this.apiUrl}/readings`);
  }

  saveReading(glucose: any): Observable<any> {
    return this.http.post(`${this.apiUrl}/save`, glucose);
  }

  deleteReading(id: number): Observable<any> {
    return this.http.delete(`${this.apiUrl}/delete/${id}`);
  }
}