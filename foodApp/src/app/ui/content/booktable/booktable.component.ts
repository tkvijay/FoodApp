import { Component } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { FormsModule } from '@angular/forms';

@Component({
  selector: 'app-booktable',
  standalone: true,
  templateUrl: './booktable.component.html',
  imports: [FormsModule],
  styleUrls: ['./booktable.component.css']
})
export class BooktableComponent {
  constructor(private http: HttpClient) {}
  
    public name: string = ''
    public email: string= ''
    public phone: string= ''
    public  date: string= ''
    public time: string= ''
    public people: string= ''
  
  onSubmit() 
  {
    const name = this.name;
    const email = this.email;
    const phone = this.phone;
    const date = this.date;
    const time = this.time;
    const numberOfPeople = this.people;
   
    const data = { name, email, phone, date, time, numberOfPeople };

    this.http.post('localhost:8080/api/booktable', data)
      .subscribe(response => {
        // Handle the response here
        console.log(response);
      });
  }

  
}
