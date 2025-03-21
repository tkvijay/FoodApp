import { Component } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import {
  FormBuilder,
  FormGroup,
  FormArray,
  Validators,
  ReactiveFormsModule,
} from "@angular/forms";


@Component({
  selector: 'app-booktable',
  standalone: true,
  templateUrl: './booktable.component.html',
  imports: [ReactiveFormsModule],
  styleUrls: ['./booktable.component.css']
})
export class BooktableComponent {

  bookTableForm: FormGroup; // Main form group

  constructor(private http: HttpClient,private fb: FormBuilder) {
    this.bookTableForm = this.fb.group({
      name: [""], // Simple input field
      email: [""], // Another input field
      phone: [""], // Another input field
      date: [""], // Another input field
      people: [""], // Another input field
    });
  }
    
  onSubmit() 
  {
    
    const data = this.bookTableForm.value;
    console.log(data);

    this.http.post('http://localhost:8080/api/booktable', data)
      .subscribe(response => {
        // Handle the response here
        console.log(response);
        alert('Table Booked Successfully');
      });
  }

  
}
