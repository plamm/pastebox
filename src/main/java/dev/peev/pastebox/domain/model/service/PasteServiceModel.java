package dev.peev.pastebox.domain.model.service;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class PasteServiceModel {
  private String id;
  private String title;
  private String content;
}
