import { Component, OnInit } from '@angular/core';
import { LoginService } from 'src/app/services/login.service';

@Component({
  selector: 'app-print-agreement',
  templateUrl: './print-agreement.component.html',
  styleUrls: ['./print-agreement.component.css']
})
export class PrintAgreementComponent implements OnInit {

  constructor(private myservice:LoginService) {
    // window.print();
   }

  ngOnInit(): void {

    setTimeout(()=>{
      window.print()
    },1000)
  }

}
