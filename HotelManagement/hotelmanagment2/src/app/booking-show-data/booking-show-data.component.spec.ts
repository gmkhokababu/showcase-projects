import { ComponentFixture, TestBed } from '@angular/core/testing';

import { BookingShowDataComponent } from './booking-show-data.component';

describe('BookingShowDataComponent', () => {
  let component: BookingShowDataComponent;
  let fixture: ComponentFixture<BookingShowDataComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ BookingShowDataComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(BookingShowDataComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
