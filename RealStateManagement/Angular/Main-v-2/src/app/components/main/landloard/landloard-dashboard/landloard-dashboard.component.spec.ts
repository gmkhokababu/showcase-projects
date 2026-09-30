import { ComponentFixture, TestBed } from '@angular/core/testing';

import { LandloardDashboardComponent } from './landloard-dashboard.component';

describe('LandloardDashboardComponent', () => {
  let component: LandloardDashboardComponent;
  let fixture: ComponentFixture<LandloardDashboardComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ LandloardDashboardComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(LandloardDashboardComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
