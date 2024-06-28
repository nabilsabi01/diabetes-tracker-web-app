import { Component } from '@angular/core';
import { CommonModule } from '@angular/common';
import { GlucoseListComponent } from './glucose-list/glucose-list.component';
import { GlucoseFormComponent } from './glucose-form/glucose-form.component';

@Component({
  selector: 'app-root',
  standalone: true,
  imports: [CommonModule, GlucoseListComponent, GlucoseFormComponent],
  template: `
    <nav class="navbar navbar-expand-lg navbar-light bg-light">
      <div class="container">
        <a class="navbar-brand" href="#">Diabetes Tracker</a>
      </div>
    </nav>

    <div class="container mt-4">
      <div class="row">
        <div class="col-md-6">
          <app-glucose-form></app-glucose-form>
        </div>
        <div class="col-md-6">
          <app-glucose-list></app-glucose-list>
        </div>
      </div>
    </div>
  `,
})
export class AppComponent {
  title = 'diabetes-tracker-frontend';
}