import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ProcessOrdersComponent } from './process-orders.component';

describe('ProcessOrdersComponent', () => {
  let component: ProcessOrdersComponent;
  let fixture: ComponentFixture<ProcessOrdersComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ProcessOrdersComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(ProcessOrdersComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
