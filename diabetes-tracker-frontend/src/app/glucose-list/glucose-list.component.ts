import { Component, OnInit } from '@angular/core';
import { CommonModule } from '@angular/common';
import { GlucoseService } from '../glucose.service';
import { Glucose } from '../models/glucose.model';

@Component({
  selector: 'app-glucose-list',
  standalone: true,
  imports: [CommonModule],
  templateUrl: './glucose-list.component.html',
  styleUrls: ['./glucose-list.component.css']
})
export class GlucoseListComponent implements OnInit {
  readings: Glucose[] = [];

  constructor(private glucoseService: GlucoseService) { }

  ngOnInit() {
    this.loadReadings();
  }

  loadReadings() {
    this.glucoseService.getAllReadings().subscribe({
      next: (data) => this.readings = data,
      error: (error) => console.error('Error fetching readings', error)
    });
  }

  deleteReading(id: number | undefined) {
    if (id !== undefined) {
      this.glucoseService.deleteReading(id).subscribe({
        next: () => {
          this.readings = this.readings.filter(reading => reading.id !== id);
        },
        error: (error) => console.error('Error deleting reading', error)
      });
    } else {
      console.error('Reading ID is undefined');
    }
  }
}
