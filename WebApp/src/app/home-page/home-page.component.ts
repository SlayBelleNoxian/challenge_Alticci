import { Component, OnInit } from '@angular/core';
import { ApiserviceService } from '../apiservice.service'
@Component({
  selector: 'app-home-page',
  templateUrl: './home-page.component.html',
  styleUrls: ['./home-page.component.css']
})
export class HomePageComponent implements OnInit {

  constructor(private apiservice: ApiserviceService) { }

  answer:any = "";
  inputValue:any = "";
  ngOnInit(): void {
  }

  onKey(event:any){
    this.inputValue = event.target.value;
  }
  getApiAnswer(): void{
    this.apiservice.getData(this.inputValue).subscribe((data) => {
      this.answer = data;
      console.log(data);
    })
  }


}
