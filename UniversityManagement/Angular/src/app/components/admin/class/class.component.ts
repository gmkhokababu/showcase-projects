import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-class',
  templateUrl: './class.component.html',
  styleUrls: ['./class.component.css']
})
export class ClassComponent implements OnInit {

  className:any;
  academicYear:any;
  classPosition:any;
  languageVersion:any;
  studentIdStart:any;
  numberOfseat:any;
  shift:any;
  constructor() { }

  ngOnInit(): void {
  }

}
