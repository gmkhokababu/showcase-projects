import { ComponentFixture, TestBed } from '@angular/core/testing';

import { LandloardComponent } from './landloard.component';

describe('LandloardComponent', () => {
  let component: LandloardComponent;
  let fixture: ComponentFixture<LandloardComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ LandloardComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(LandloardComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
