import { ComponentFixture, TestBed } from '@angular/core/testing';

import { FabulousComponent } from './fabulous.component';

describe('FabulousComponent', () => {
  let component: FabulousComponent;
  let fixture: ComponentFixture<FabulousComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ FabulousComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(FabulousComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
