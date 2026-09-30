import { ComponentFixture, TestBed } from '@angular/core/testing';

import { PryBookingComponent } from './pry-booking.component';

describe('PryBookingComponent', () => {
  let component: PryBookingComponent;
  let fixture: ComponentFixture<PryBookingComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ PryBookingComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(PryBookingComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
