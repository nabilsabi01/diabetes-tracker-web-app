import { Component } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { GlucoseService } from '../glucose.service';

@Component({
  selector: 'app-glucose-form',
  standalone: true,
  imports: [FormsModule],
  templateUrl: './glucose-form.component.html',
  styleUrls: ['./glucose-form.component.css']
})
export class GlucoseFormComponent {
  glucose = {
    glucoseLevel: null,
    readingTime: new Date().toISOString().slice(0, 16),
    measurementUnit: 'mg/dL',
    notes: ''
  };

  constructor(private glucoseService: GlucoseService) { }

  onSubmit() {
    this.glucoseService.saveReading(this.glucose).subscribe({
      next: (response) => {
        console.log('Reading saved', response);
        this.resetForm();
      },
      error: (error) => console.error('Error saving reading', error)
    });
  }

  resetForm() {
    this.glucose = {
      glucoseLevel: null,
      readingTime: new Date().toISOString().slice(0, 16),
      measurementUnit: 'mg/dL',
      notes: ''
    };
  }
}