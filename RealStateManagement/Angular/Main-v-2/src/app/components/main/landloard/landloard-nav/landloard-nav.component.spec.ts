import { ComponentFixture, TestBed } from '@angular/core/testing';

import { LandloardNavComponent } from './landloard-nav.component';

describe('LandloardNavComponent', () => {
  let component: LandloardNavComponent;
  let fixture: ComponentFixture<LandloardNavComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ LandloardNavComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(LandloardNavComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
