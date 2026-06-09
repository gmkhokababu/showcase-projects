import { ComponentFixture, TestBed } from '@angular/core/testing';

import { PublicSideNavComponent } from './public-side-nav.component';

describe('PublicSideNavComponent', () => {
  let component: PublicSideNavComponent;
  let fixture: ComponentFixture<PublicSideNavComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [PublicSideNavComponent]
    })
    .compileComponents();

    fixture = TestBed.createComponent(PublicSideNavComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
