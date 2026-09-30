import { ComponentFixture, TestBed } from '@angular/core/testing';

import { AllpropertyComponent } from './allproperty.component';

describe('AllpropertyComponent', () => {
  let component: AllpropertyComponent;
  let fixture: ComponentFixture<AllpropertyComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ AllpropertyComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(AllpropertyComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
