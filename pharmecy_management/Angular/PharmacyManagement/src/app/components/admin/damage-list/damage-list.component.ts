import { Component, OnInit } from '@angular/core';
import { ControlContainer } from '@angular/forms';
import { ControllerrService } from 'src/app/service/controllerr.service';

@Component({
  selector: 'app-damage-list',
  templateUrl: './damage-list.component.html',
  styleUrls: ['./damage-list.component.css']
})
export class DamageListComponent implements OnInit {

  constructor(private myservice: ControllerrService) {
    this.myservice.getDamegeList(this.status).subscribe((x) => {
      this.damageListSummary = x
    })
  }

  ngOnInit(): void {
  }


  status: any = "damaged";
  service: any = "damage-List-Summery";
  damageListSummary: any[] = []
  damageListdetails: any = [];
  subTotal:any=0;

  showDetails(val: any) {

    this.service = "damage-details";
    this.myservice.getallDamegeList(val).subscribe((x) => {
      this.damageListdetails = x;
    })
  }

  damageList() {

    this.service = "damage-details";
  }
  returnList() {

    this.service = "damage-details";
  }
  confirmReturn(){

  }

}
