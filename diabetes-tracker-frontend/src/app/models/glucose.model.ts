export interface Glucose {
    id?: number;
    glucoseLevel: number;
    readingTime: string;
    measurementUnit: 'mg/dL' | 'mmol/L';
    notes: string;
  }