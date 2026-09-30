import { ComponentFixture, TestBed } from '@angular/core/testing';

import { OrderShowDataComponent } from './order-show-data.component';

describe('OrderShowDataComponent', () => {
  let component: OrderShowDataComponent;
  let fixture: ComponentFixture<OrderShowDataComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ OrderShowDataComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(OrderShowDataComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
