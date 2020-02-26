package gCloud12Application

import scala.concurrent.duration._

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._

object CloudSupportService {

	val headers_0 = Map("Upgrade-Insecure-Requests" -> "1",
		"X-CSRFToken" -> "${csrf}")

	val headers_2 = Map(
		"Content-Type" -> "multipart/form-data; boundary=--WebKitFormBoundaryH2hTfwjGBpETaysO",
		"Origin" -> "http://localhost",
		"Upgrade-Insecure-Requests" -> "1",
		"X-CSRFToken" -> "${csrf}")

	val headers_39 = Map(
		"Origin" -> "http://localhost",
		"Upgrade-Insecure-Requests" -> "1",
		"X-CSRFToken" -> "${csrf}")

	var sp = System.getProperty("scalePauses").toDouble

	val cloudSupportService = exec(
		exitBlockOnFail {
			pause((sp*11).toInt)
			.exec(http("support_service_request_0")
				.get("/suppliers/frameworks/g-cloud-12/submissions/cloud-support")
				.headers(headers_0))
			.pause((sp*11).toInt)
			.exec(http("support_service_request_1")
				.get("/suppliers/frameworks/g-cloud-12/submissions/cloud-support/create")
				.headers(headers_0))
			.pause((sp*11).toInt)
			.exec(http("support_service_request_2")
				.post("/suppliers/frameworks/g-cloud-12/submissions/cloud-support/create")
				.headers(headers_2)
				.body(RawFileBody("gCloud12Application/CloudSupportService_0002_request.txt"))
				.check(currentLocationRegex(".*/(\\d*)").saveAs("cloud_support_service_id")))
			.pause((sp*23).toInt)
			.exec(http("support_service_request_3")
				.get("/suppliers/frameworks/g-cloud-12/submissions/cloud-support/${cloud_support_service_id}/edit/about-your-service/service-description")
				.headers(headers_0))
			.pause((sp*11).toInt)
			.exec(http("support_service_request_4")
				.post("/suppliers/frameworks/g-cloud-12/submissions/cloud-support/${cloud_support_service_id}/edit/about-your-service/service-description")
				.headers(headers_2)
				.body(RawFileBody("gCloud12Application/CloudSupportService_0004_request.txt")))
			.pause((sp*23).toInt)
			.exec(http("support_service_request_5")
				.get("/suppliers/frameworks/g-cloud-12/submissions/cloud-support/${cloud_support_service_id}/edit/service-features-and-benefits/service-features-and-benefits")
				.headers(headers_0))
			.pause((sp*11).toInt)
			.exec(http("support_service_request_6")
				.post("/suppliers/frameworks/g-cloud-12/submissions/cloud-support/${cloud_support_service_id}/edit/service-features-and-benefits/service-features-and-benefits")
				.headers(headers_2)
				.body(RawFileBody("gCloud12Application/CloudSupportService_0006_request.txt")))
			.pause((sp*23).toInt)
			.exec(http("support_service_request_7")
				.get("/suppliers/frameworks/g-cloud-12/submissions/cloud-support/${cloud_support_service_id}/edit/planning/planning")
				.headers(headers_0))
			.pause((sp*11).toInt)
			.exec(http("support_service_request_8")
				.post("/suppliers/frameworks/g-cloud-12/submissions/cloud-support/${cloud_support_service_id}/edit/planning/planning")
				.headers(headers_2)
				.body(RawFileBody("gCloud12Application/CloudSupportService_0008_request.txt")))
			.pause((sp*23).toInt)
			.exec(http("support_service_request_9")
				.get("/suppliers/frameworks/g-cloud-12/submissions/cloud-support/${cloud_support_service_id}/edit/setup-and-migration/setup-and-migration")
				.headers(headers_0))
			.pause((sp*11).toInt)
			.exec(http("support_service_request_10")
				.post("/suppliers/frameworks/g-cloud-12/submissions/cloud-support/${cloud_support_service_id}/edit/setup-and-migration/setup-and-migration")
				.headers(headers_2)
				.body(RawFileBody("gCloud12Application/CloudSupportService_0010_request.txt")))
			.pause((sp*23).toInt)
			.exec(http("support_service_request_11")
				.get("/suppliers/frameworks/g-cloud-12/submissions/cloud-support/${cloud_support_service_id}/edit/quality-assurance-and-performance-testing/quality-assurance-and-performance-testing")
				.headers(headers_0))
			.pause((sp*11).toInt)
			.exec(http("support_service_request_12")
				.post("/suppliers/frameworks/g-cloud-12/submissions/cloud-support/${cloud_support_service_id}/edit/quality-assurance-and-performance-testing/quality-assurance-and-performance-testing")
				.headers(headers_2)
				.body(RawFileBody("gCloud12Application/CloudSupportService_0012_request.txt")))
			.pause((sp*23).toInt)
			.exec(http("support_service_request_13")
				.get("/suppliers/frameworks/g-cloud-12/submissions/cloud-support/${cloud_support_service_id}/edit/security-services/security-services")
				.headers(headers_0))
			.pause((sp*11).toInt)
			.exec(http("support_service_request_14")
				.post("/suppliers/frameworks/g-cloud-12/submissions/cloud-support/${cloud_support_service_id}/edit/security-services/security-services")
				.headers(headers_2)
				.body(RawFileBody("gCloud12Application/CloudSupportService_0014_request.txt")))
			.pause((sp*23).toInt)
			.exec(http("support_service_request_15")
				.get("/suppliers/frameworks/g-cloud-12/submissions/cloud-support/${cloud_support_service_id}/edit/training/training")
				.headers(headers_0))
			.pause((sp*11).toInt)
			.exec(http("support_service_request_16")
				.post("/suppliers/frameworks/g-cloud-12/submissions/cloud-support/${cloud_support_service_id}/edit/training/training")
				.headers(headers_2)
				.body(RawFileBody("gCloud12Application/CloudSupportService_0016_request.txt")))
			.pause((sp*23).toInt)
			.exec(http("support_service_request_17")
				.get("/suppliers/frameworks/g-cloud-12/submissions/cloud-support/${cloud_support_service_id}/edit/ongoing-support/ongoing-support")
				.headers(headers_0))
			.pause((sp*11).toInt)
			.exec(http("support_service_request_18")
				.post("/suppliers/frameworks/g-cloud-12/submissions/cloud-support/${cloud_support_service_id}/edit/ongoing-support/ongoing-support")
				.headers(headers_2)
				.body(RawFileBody("gCloud12Application/CloudSupportService_0018_request.txt")))
			.pause((sp*23).toInt)
			.exec(http("support_service_request_19")
				.get("/suppliers/frameworks/g-cloud-12/submissions/cloud-support/${cloud_support_service_id}/edit/service-scope/service-constraints")
				.headers(headers_0))
			.pause((sp*11).toInt)
			.exec(http("support_service_request_20")
				.post("/suppliers/frameworks/g-cloud-12/submissions/cloud-support/${cloud_support_service_id}/edit/service-scope/service-constraints")
				.headers(headers_2)
				.body(RawFileBody("gCloud12Application/CloudSupportService_0020_request.txt")))
			.pause((sp*23).toInt)
			.exec(http("support_service_request_21")
				.get("/suppliers/frameworks/g-cloud-12/submissions/cloud-support/${cloud_support_service_id}/edit/reselling/supplier-type")
				.headers(headers_0))
			.pause((sp*11).toInt)
			.exec(http("support_service_request_22")
				.post("/suppliers/frameworks/g-cloud-12/submissions/cloud-support/${cloud_support_service_id}/edit/reselling/supplier-type")
				.headers(headers_2)
				.body(RawFileBody("gCloud12Application/CloudSupportService_0022_request.txt")))
			.pause((sp*23).toInt)
			.exec(http("support_service_request_23")
				.get("/suppliers/frameworks/g-cloud-12/submissions/cloud-support/${cloud_support_service_id}/edit/user-support/email-or-ticketing-support")
				.headers(headers_0))
			.pause((sp*11).toInt)
			.exec(http("support_service_request_24")
				.post("/suppliers/frameworks/g-cloud-12/submissions/cloud-support/${cloud_support_service_id}/edit/user-support/email-or-ticketing-support")
				.headers(headers_2)
				.body(RawFileBody("gCloud12Application/CloudSupportService_0024_request.txt")))
			.pause((sp*23).toInt)
			.exec(http("support_service_request_25")
				.post("/suppliers/frameworks/g-cloud-12/submissions/cloud-support/${cloud_support_service_id}/edit/user-support/phone-support")
				.headers(headers_2)
				.body(RawFileBody("gCloud12Application/CloudSupportService_0025_request.txt")))
			.pause((sp*23).toInt)
			.exec(http("support_service_request_26")
				.post("/suppliers/frameworks/g-cloud-12/submissions/cloud-support/${cloud_support_service_id}/edit/user-support/web-chat-support")
				.headers(headers_2)
				.body(RawFileBody("gCloud12Application/CloudSupportService_0026_request.txt")))
			.pause((sp*23).toInt)
			.exec(http("support_service_request_27")
				.post("/suppliers/frameworks/g-cloud-12/submissions/cloud-support/${cloud_support_service_id}/edit/user-support/support-levels")
				.headers(headers_2)
				.body(RawFileBody("gCloud12Application/CloudSupportService_0027_request.txt")))
			.pause((sp*23).toInt)
			.exec(http("support_service_request_28")
				.get("/suppliers/frameworks/g-cloud-12/submissions/cloud-support/${cloud_support_service_id}/edit/staff-security/staff-security-clearance-checks")
				.headers(headers_0))
			.pause((sp*11).toInt)
			.exec(http("support_service_request_29")
				.post("/suppliers/frameworks/g-cloud-12/submissions/cloud-support/${cloud_support_service_id}/edit/staff-security/staff-security-clearance-checks")
				.headers(headers_2)
				.body(RawFileBody("gCloud12Application/CloudSupportService_0029_request.txt")))
			.pause((sp*23).toInt)
			.exec(http("support_service_request_30")
				.post("/suppliers/frameworks/g-cloud-12/submissions/cloud-support/${cloud_support_service_id}/edit/staff-security/government-security-clearances")
				.headers(headers_2)
				.body(RawFileBody("gCloud12Application/CloudSupportService_0030_request.txt")))
			.pause((sp*23).toInt)
			.exec(http("support_service_request_31")
				.get("/suppliers/frameworks/g-cloud-12/submissions/cloud-support/${cloud_support_service_id}/edit/pricing/price")
				.headers(headers_0))
			.pause((sp*11).toInt)
			.exec(http("support_service_request_32")
				.post("/suppliers/frameworks/g-cloud-12/submissions/cloud-support/${cloud_support_service_id}/edit/pricing/price")
				.headers(headers_2)
				.body(RawFileBody("gCloud12Application/CloudSupportService_0032_request.txt")))
			.pause((sp*23).toInt)
			.exec(http("support_service_request_33")
				.post("/suppliers/frameworks/g-cloud-12/submissions/cloud-support/${cloud_support_service_id}/edit/pricing/education-pricing")
				.headers(headers_2)
				.body(RawFileBody("gCloud12Application/CloudSupportService_0033_request.txt")))
			.pause((sp*23).toInt)
			.exec(http("support_service_request_34")
				.get("/suppliers/frameworks/g-cloud-12/submissions/cloud-support/${cloud_support_service_id}/edit/documents/service-definition-document-url")
				.headers(headers_0))
			.pause((sp*11).toInt)
			.exec(http("support_service_request_35")
				.post("/suppliers/frameworks/g-cloud-12/submissions/cloud-support/${cloud_support_service_id}/edit/documents/service-definition-document-url")
				.headers(headers_2)
				.body(RawFileBody("gCloud12Application/CloudSupportService_0035_request.txt")))
			.pause((sp*23).toInt)
			.exec(http("support_service_request_36")
				.post("/suppliers/frameworks/g-cloud-12/submissions/cloud-support/${cloud_support_service_id}/edit/documents/terms-and-conditions-document-url")
				.headers(headers_2)
				.body(RawFileBody("gCloud12Application/CloudSupportService_0036_request.txt")))
			.pause((sp*23).toInt)
			.exec(http("support_service_request_37")
				.post("/suppliers/frameworks/g-cloud-12/submissions/cloud-support/${cloud_support_service_id}/edit/documents/pricing-document-url")
				.headers(headers_2)
				.body(RawFileBody("gCloud12Application/CloudSupportService_0037_request.txt")))
			.pause((sp*23).toInt)
			.exec(http("support_service_request_38")
				.post("/suppliers/frameworks/g-cloud-12/submissions/cloud-support/${cloud_support_service_id}/edit/documents/sfia-rate-document-url")
				.headers(headers_2)
				.body(RawFileBody("gCloud12Application/CloudSupportService_0038_request.txt")))
			.pause((sp*23).toInt)
			.randomSwitch(
				50.0 -> exec(http("support_service_request_39")
					.post("/suppliers/frameworks/g-cloud-12/submissions/cloud-support/${cloud_support_service_id}/complete")
					.headers(headers_39))
				.pause((sp*11).toInt)
			)
		}
	)
}
