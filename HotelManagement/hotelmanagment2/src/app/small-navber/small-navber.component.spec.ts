import { ComponentFixture, TestBed } from '@angular/core/testing';

import { SmallNavberComponent } from './small-navber.component';

describe('SmallNavberComponent', () => {
  let component: SmallNavberComponent;
  let fixture: ComponentFixture<SmallNavberComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ SmallNavberComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(SmallNavberComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
