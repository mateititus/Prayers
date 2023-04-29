import * as constants from "../../utilities/constants.js";

const listaPartcipantiHomeButtonSelector =
  constants.listaPartcipantiHomeButtonSelector;
const listaParticipantiTableHeader = constants.listaParticipantiTableHeader;
const adaugaParticipantButtonSelector =
  constants.adaugaParticipantButtonSelector;
const numeParticipantFieldSelector = constants.numeParticipantFieldSelector;
const prenumeParticipantFieldSelector =
  constants.prenumeParticipantFieldSelector;
const varstaParticipantFieldSelector = constants.varstaParticipantFieldSelector;
const telefonParticipantFieldSelector =
  constants.telefonParticipantFieldSelector;
const salveazaParticipantButtonSelector =
  constants.salveazaParticipantButtonSelector;
const numeParticipantSelector = constants.numeParticipantSelector;
const stergeParticipantButtonSelector =
  constants.stergeParticipantButtonSelector;

describe("Add member", () => {
  it("Verify you can add a new member to the list", () => {
    cy.visit("/");
    cy.get(listaPartcipantiHomeButtonSelector).click();
    cy.get(listaParticipantiTableHeader)
      .should("be.visible")
      .and("have.text", "Lista participanti");
    cy.get(adaugaParticipantButtonSelector).click();
    cy.get(numeParticipantFieldSelector).type("Popescu");
    cy.get(prenumeParticipantFieldSelector).type("Mihai");
    cy.get(varstaParticipantFieldSelector).type("30");
    cy.get(telefonParticipantFieldSelector).type("0741234567");
    cy.get(salveazaParticipantButtonSelector).click();
    cy.get(numeParticipantSelector)
      .eq(1)
      .should("be.visible")
      .and("have.text", "Popescu");
    cy.get(stergeParticipantButtonSelector).eq(1).click();
    cy.contains("Popescu").should("not.exist");
  });
});
