package gCloud12Application

import scala.concurrent.duration._

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._

object Declaration {

	val headers_0 = Map("Upgrade-Insecure-Requests" -> "1",
		"X-CSRFToken" -> "${csrf}")

	val headers_3 = Map(
		"Origin" -> "http://localhost",
		"Upgrade-Insecure-Requests" -> "1",
		"X-CSRFToken" -> "${csrf}")

	var sp = System.getProperty("scalePauses").toDouble

	val declaration = exec(http("declaration_request_press_apply")
			.post("/suppliers/frameworks/g-cloud-12")
			.headers(headers_0))
		.pause((sp*23).toInt)
		.exec(http("declaration_request_0")
			.get("/suppliers/frameworks/g-cloud-12/declaration/start")
			.headers(headers_0))
		.pause((sp*11).toInt)
		.exec(http("declaration_request_1")
			.get("/suppliers/frameworks/g-cloud-12/declaration/reuse")
			.headers(headers_0))
		.pause((sp*11).toInt)
		.exec(http("declaration_request_2")
			.get("/suppliers/frameworks/g-cloud-12/declaration/edit/providing-suitable-services")
			.headers(headers_0))
		.pause((sp*11).toInt)
		.exec(http("declaration_request_3")
			.post("/suppliers/frameworks/g-cloud-12/declaration/edit/providing-suitable-services")
			.headers(headers_3)
			.formParam("servicesHaveOrSupportCloudHostingCloudSoftware", "Yes")
			.formParam("servicesHaveOrSupportCloudSupport", "Yes")
			.formParam("servicesDoNotInclude", "True")
			.formParam("offerServicesYourselves", "True")
			.formParam("fullAccountability", "True"))
		.pause((sp*23).toInt)
		.exec(http("declaration_request_4")
			.post("/suppliers/frameworks/g-cloud-12/declaration/edit/what-it-means-to-be-on-g-cloud-12")
			.headers(headers_3)
			.formParam("termsOfParticipation", "True")
			.formParam("termsAndConditions", "True")
			.formParam("canProvideFromDayOne", "True")
			.formParam("unfairCompetition", "True")
			.formParam("10WorkingDays", "True")
			.formParam("MI", "True"))
		.pause((sp*23).toInt)
		.exec(http("declaration_request_5")
			.post("/suppliers/frameworks/g-cloud-12/declaration/edit/grounds-for-mandatory-exclusion")
			.headers(headers_3)
			.formParam("conspiracy", "False")
			.formParam("corruptionBribery", "False")
			.formParam("fraudAndTheft", "False")
			.formParam("terrorism", "False")
			.formParam("organisedCrime", "False"))
		.pause((sp*23).toInt)
		.exec(http("declaration_request_6")
			.post("/suppliers/frameworks/g-cloud-12/declaration/edit/grounds-for-discretionary-exclusion")
			.headers(headers_3)
			.formParam("taxEvasion", "False")
			.formParam("environmentalSocialLabourLaw", "False")
			.formParam("bankrupt", "False")
			.formParam("graveProfessionalMisconduct", "False")
			.formParam("distortingCompetition", "False")
			.formParam("conflictOfInterest", "False")
			.formParam("distortedCompetition", "False")
			.formParam("significantOrPersistentDeficiencies", "False")
			.formParam("seriousMisrepresentation", "False")
			.formParam("witheldSupportingDocuments", "False")
			.formParam("influencedContractingAuthority", "False")
			.formParam("confidentialInformation", "False")
			.formParam("misleadingInformation", "False")
			.formParam("mitigatingFactors", "")
			.formParam("unspentTaxConvictions", "False")
			.formParam("GAAR", "False")
			.formParam("mitigatingFactors2", ""))
		.pause((sp*23).toInt)
		.exec(http("declaration_request_7")
			.post("/suppliers/frameworks/g-cloud-12/declaration/edit/working-with-government")
			.headers(headers_3)
			.formParam("environmentallyFriendly", "True")
			.formParam("equalityAndDiversity", "True")
			.formParam("employersInsurance", "Yes – your organisation has, or will have in place, employer’s liability insurance of at least £5 million and you will provide certification before the framework is awarded.")
			.formParam("helpBuyersComplyTechnologyCodesOfPractice", "True")
			.formParam("publishContracts", "True"))
		.pause((sp*23).toInt)
		.exec(http("declaration_request_8")
			.post("/suppliers/frameworks/g-cloud-12/declaration/edit/how-you-apply")
			.headers(headers_3)
			.formParam("readUnderstoodGuidance", "True")
			.formParam("understandTool", "True")
			.formParam("understandHowToAskQuestions", "True"))
		.pause((sp*23).toInt)
		.exec(http("declaration_request_9")
			.post("/suppliers/frameworks/g-cloud-12/declaration/edit/application-accuracy")
			.headers(headers_3)
			.formParam("accurateInformation", "True")
			.formParam("informationChanges", "True")
			.formParam("accuratelyDescribed", "True")
			.formParam("proofOfClaims", "True")
			.formParam("dunsNumberCompanyRegistrationNumber", "True"))
		.pause((sp*23).toInt)
		.exec(http("declaration_request_10")
			.post("/suppliers/frameworks/g-cloud-12/declaration/edit/how-youll-deliver-your-services")
			.headers(headers_3)
			.formParam("subcontracting", "yourself without the use of third parties (subcontractors)"))
		.pause((sp*23).toInt)
		.exec(http("declaration_request_11")
			.post("/suppliers/frameworks/g-cloud-12/declaration/edit/contact-details")
			.headers(headers_3)
			.formParam("primaryContact", "Mrs L. Test")
			.formParam("primaryContactEmail", "load@test.com")
			.formParam("contactNameContractNotice", "Mrs L. Test")
			.formParam("contactEmailContractNotice", "load@test.com"))
		.pause((sp*23).toInt)
		.exec(http("declaration_request_12")
			.post("/suppliers/frameworks/g-cloud-12/declaration/edit/modern-slavery")
			.headers(headers_3)
			.formParam("modernSlaveryTurnover", "False")
			.formParam("save_and_return_to_overview", "Save and return to declaration overview"))
		.pause((sp*23).toInt)
		.exec(http("declaration_request_13")
			.post("/suppliers/frameworks/g-cloud-12/declaration")
			.headers(headers_3))
		.pause((sp*23).toInt)
}
