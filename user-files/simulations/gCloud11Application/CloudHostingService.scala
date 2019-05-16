package gCloud11Application

import scala.concurrent.duration._

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._

object CloudHostingService {

	val headers_0 = Map("Upgrade-Insecure-Requests" -> "1")

	val headers_3 = Map(
		"Content-Type" -> "multipart/form-data; boundary=--WebKitFormBoundaryH2hTfwjGBpETaysO",
		"Origin" -> "http://localhost",
		"Upgrade-Insecure-Requests" -> "1")

	val headers_99 = Map(
		"Origin" -> "http://localhost",
		"Upgrade-Insecure-Requests" -> "1")

    var sp = System.getProperty("scalePauses").toDouble

	val chain_0 = exec(http("hosting_service_request_0")
			.get("/suppliers/frameworks/g-cloud-11/submissions")
			.headers(headers_0))
		.pause((sp*11).toInt)
		.exec(http("hosting_service_request_1")
			.get("/suppliers/frameworks/g-cloud-11/submissions/cloud-hosting")
			.headers(headers_0))
		.pause((sp*11).toInt)
		.exec(http("hosting_service_request_2")
			.get("/suppliers/frameworks/g-cloud-11/submissions/cloud-hosting/create")
			.headers(headers_0))
		.pause((sp*11).toInt)
		.exec(http("hosting_service_request_3")
			.post("/suppliers/frameworks/g-cloud-11/submissions/cloud-hosting/create")
			.headers(headers_3)
			.body(RawFileBody("CloudHostingService_0003_request.txt"))
			.check(currentLocationRegex(".*/(\\d*)").saveAs("cloud_hosting_service_id")))
		.pause((sp*23).toInt)
		.exec(http("hosting_service_request_4")
			.get("/suppliers/frameworks/g-cloud-11/submissions/cloud-hosting/${cloud_hosting_service_id}/edit/about-your-service/service-description")
			.headers(headers_0))
		.pause((sp*11).toInt)
		.exec(http("hosting_service_request_5")
			.post("/suppliers/frameworks/g-cloud-11/submissions/cloud-hosting/${cloud_hosting_service_id}/edit/about-your-service/service-description")
			.headers(headers_3)
			.body(RawFileBody("CloudHostingService_0005_request.txt")))
		.pause((sp*23).toInt)
		.exec(http("hosting_service_request_6")
			.post("/suppliers/frameworks/g-cloud-11/submissions/cloud-hosting/${cloud_hosting_service_id}/edit/about-your-service/service-categories")
			.headers(headers_3)
			.body(RawFileBody("CloudHostingService_0006_request.txt")))
		.pause((sp*23).toInt)
		.exec(http("hosting_service_request_7")
			.get("/suppliers/frameworks/g-cloud-11/submissions/cloud-hosting/${cloud_hosting_service_id}/edit/service-features-and-benefits/service-features-and-benefits")
			.headers(headers_0))
		.pause((sp*11).toInt)
		.exec(http("hosting_service_request_8")
			.post("/suppliers/frameworks/g-cloud-11/submissions/cloud-hosting/${cloud_hosting_service_id}/edit/service-features-and-benefits/service-features-and-benefits")
			.headers(headers_3)
			.body(RawFileBody("CloudHostingService_0008_request.txt")))
		.pause((sp*23).toInt)
		.exec(http("hosting_service_request_9")
			.get("/suppliers/frameworks/g-cloud-11/submissions/cloud-hosting/${cloud_hosting_service_id}/edit/service-scope/service-constraints")
			.headers(headers_0))
		.pause((sp*11).toInt)
		.exec(http("hosting_service_request_10")
			.post("/suppliers/frameworks/g-cloud-11/submissions/cloud-hosting/${cloud_hosting_service_id}/edit/service-scope/service-constraints")
			.headers(headers_3)
			.body(RawFileBody("CloudHostingService_0010_request.txt")))
		.pause((sp*23).toInt)
		.exec(http("hosting_service_request_11")
			.post("/suppliers/frameworks/g-cloud-11/submissions/cloud-hosting/${cloud_hosting_service_id}/edit/service-scope/system-requirements")
			.headers(headers_3)
			.body(RawFileBody("CloudHostingService_0011_request.txt")))
		.pause((sp*23).toInt)
		.exec(http("hosting_service_request_12")
			.get("/suppliers/frameworks/g-cloud-11/submissions/cloud-hosting/${cloud_hosting_service_id}/edit/reselling/supplier-type")
			.headers(headers_0))
		.pause((sp*11).toInt)
		.exec(http("hosting_service_request_13")
			.post("/suppliers/frameworks/g-cloud-11/submissions/cloud-hosting/${cloud_hosting_service_id}/edit/reselling/supplier-type")
			.headers(headers_3)
			.body(RawFileBody("CloudHostingService_0013_request.txt")))
		.pause((sp*23).toInt)
		.exec(http("hosting_service_request_14")
			.get("/suppliers/frameworks/g-cloud-11/submissions/cloud-hosting/${cloud_hosting_service_id}/edit/user-support/email-or-ticketing-support")
			.headers(headers_0))
		.pause((sp*11).toInt)
		.exec(http("hosting_service_request_15")
			.post("/suppliers/frameworks/g-cloud-11/submissions/cloud-hosting/${cloud_hosting_service_id}/edit/user-support/email-or-ticketing-support")
			.headers(headers_3)
			.body(RawFileBody("CloudHostingService_0015_request.txt")))
		.pause((sp*23).toInt)
		.exec(http("hosting_service_request_16")
			.post("/suppliers/frameworks/g-cloud-11/submissions/cloud-hosting/${cloud_hosting_service_id}/edit/user-support/phone-support")
			.headers(headers_3)
			.body(RawFileBody("CloudHostingService_0016_request.txt")))
		.pause((sp*23).toInt)
		.exec(http("hosting_service_request_17")
			.post("/suppliers/frameworks/g-cloud-11/submissions/cloud-hosting/${cloud_hosting_service_id}/edit/user-support/web-chat-support")
			.headers(headers_3)
			.body(RawFileBody("CloudHostingService_0017_request.txt")))
		.pause((sp*23).toInt)
		.exec(http("hosting_service_request_18")
			.post("/suppliers/frameworks/g-cloud-11/submissions/cloud-hosting/${cloud_hosting_service_id}/edit/user-support/onsite-support")
			.headers(headers_3)
			.body(RawFileBody("CloudHostingService_0018_request.txt")))
		.pause((sp*23).toInt)
		.exec(http("hosting_service_request_19")
			.post("/suppliers/frameworks/g-cloud-11/submissions/cloud-hosting/${cloud_hosting_service_id}/edit/user-support/support-levels")
			.headers(headers_3)
			.body(RawFileBody("CloudHostingService_0019_request.txt")))
		.pause((sp*23).toInt)
		.exec(http("hosting_service_request_20")
			.post("/suppliers/frameworks/g-cloud-11/submissions/cloud-hosting/${cloud_hosting_service_id}/edit/user-support/support-available-to-third-party")
			.headers(headers_3)
			.body(RawFileBody("CloudHostingService_0020_request.txt")))
		.pause((sp*23).toInt)
		.exec(http("hosting_service_request_21")
			.get("/suppliers/frameworks/g-cloud-11/submissions/cloud-hosting/${cloud_hosting_service_id}/edit/how-users-work-with-your-service/web-interface")
			.headers(headers_0))
		.pause((sp*11).toInt)
		.exec(http("hosting_service_request_22")
			.post("/suppliers/frameworks/g-cloud-11/submissions/cloud-hosting/${cloud_hosting_service_id}/edit/how-users-work-with-your-service/web-interface")
			.headers(headers_3)
			.body(RawFileBody("CloudHostingService_0022_request.txt")))
		.pause((sp*23).toInt)
		.exec(http("hosting_service_request_23")
			.post("/suppliers/frameworks/g-cloud-11/submissions/cloud-hosting/${cloud_hosting_service_id}/edit/how-users-work-with-your-service/api")
			.headers(headers_3)
			.body(RawFileBody("CloudHostingService_0023_request.txt")))
		.pause((sp*23).toInt)
		.exec(http("hosting_service_request_24")
			.post("/suppliers/frameworks/g-cloud-11/submissions/cloud-hosting/${cloud_hosting_service_id}/edit/how-users-work-with-your-service/command-line-interface")
			.headers(headers_3)
			.body(RawFileBody("CloudHostingService_0024_request.txt")))
		.pause((sp*23).toInt)
		.exec(http("hosting_service_request_25")
			.get("/suppliers/frameworks/g-cloud-11/submissions/cloud-hosting/${cloud_hosting_service_id}/edit/onboarding-and-offboarding/getting-started")
			.headers(headers_0))
		.pause((sp*11).toInt)
		.exec(http("hosting_service_request_26")
			.post("/suppliers/frameworks/g-cloud-11/submissions/cloud-hosting/${cloud_hosting_service_id}/edit/onboarding-and-offboarding/getting-started")
			.headers(headers_3)
			.body(RawFileBody("CloudHostingService_0026_request.txt")))
		.pause((sp*23).toInt)
		.exec(http("hosting_service_request_27")
			.post("/suppliers/frameworks/g-cloud-11/submissions/cloud-hosting/${cloud_hosting_service_id}/edit/onboarding-and-offboarding/documentation")
			.headers(headers_3)
			.body(RawFileBody("CloudHostingService_0027_request.txt")))
		.pause((sp*23).toInt)
		.exec(http("hosting_service_request_28")
			.post("/suppliers/frameworks/g-cloud-11/submissions/cloud-hosting/${cloud_hosting_service_id}/edit/onboarding-and-offboarding/end-of-contract-data-extraction")
			.headers(headers_3)
			.body(RawFileBody("CloudHostingService_0028_request.txt")))
		.pause((sp*23).toInt)
		.exec(http("hosting_service_request_29")
			.post("/suppliers/frameworks/g-cloud-11/submissions/cloud-hosting/${cloud_hosting_service_id}/edit/onboarding-and-offboarding/end-of-contract-process")
			.headers(headers_3)
			.body(RawFileBody("CloudHostingService_0029_request.txt")))
		.pause((sp*23).toInt)
		.exec(http("hosting_service_request_30")
			.get("/suppliers/frameworks/g-cloud-11/submissions/cloud-hosting/${cloud_hosting_service_id}/edit/backups-and-recovery/backup-and-recovery")
			.headers(headers_0))
		.pause((sp*11).toInt)
		.exec(http("hosting_service_request_31")
			.post("/suppliers/frameworks/g-cloud-11/submissions/cloud-hosting/${cloud_hosting_service_id}/edit/backups-and-recovery/backup-and-recovery")
			.headers(headers_3)
			.body(RawFileBody("CloudHostingService_0031_request.txt")))
		.pause((sp*23).toInt)
		.exec(http("hosting_service_request_32")
			.get("/suppliers/frameworks/g-cloud-11/submissions/cloud-hosting/${cloud_hosting_service_id}/edit/analytics/metrics")
			.headers(headers_0))
		.pause((sp*11).toInt)
		.exec(http("hosting_service_request_33")
			.post("/suppliers/frameworks/g-cloud-11/submissions/cloud-hosting/${cloud_hosting_service_id}/edit/analytics/metrics")
			.headers(headers_3)
			.body(RawFileBody("CloudHostingService_0033_request.txt")))
		.pause((sp*23).toInt)
		.exec(http("hosting_service_request_34")
			.get("/suppliers/frameworks/g-cloud-11/submissions/cloud-hosting/${cloud_hosting_service_id}/edit/scaling/scaling")
			.headers(headers_0))
		.pause((sp*11).toInt)
		.exec(http("hosting_service_request_35")
			.post("/suppliers/frameworks/g-cloud-11/submissions/cloud-hosting/${cloud_hosting_service_id}/edit/scaling/scaling")
			.headers(headers_3)
			.body(RawFileBody("CloudHostingService_0035_request.txt")))
		.pause((sp*23).toInt)
		.exec(http("hosting_service_request_36")
			.post("/suppliers/frameworks/g-cloud-11/submissions/cloud-hosting/${cloud_hosting_service_id}/edit/scaling/independence-of-resources")
			.headers(headers_3)
			.body(RawFileBody("CloudHostingService_0036_request.txt")))
		.pause((sp*23).toInt)
		.exec(http("hosting_service_request_37")
			.post("/suppliers/frameworks/g-cloud-11/submissions/cloud-hosting/${cloud_hosting_service_id}/edit/scaling/usage-notifications")
			.headers(headers_3)
			.body(RawFileBody("CloudHostingService_0037_request.txt")))
		.pause((sp*23).toInt)
		.exec(http("hosting_service_request_38")
			.get("/suppliers/frameworks/g-cloud-11/submissions/cloud-hosting/${cloud_hosting_service_id}/edit/data-in-transit-protection/protection-between-networks")
			.headers(headers_0))
		.pause((sp*11).toInt)
		.exec(http("hosting_service_request_39")
			.post("/suppliers/frameworks/g-cloud-11/submissions/cloud-hosting/${cloud_hosting_service_id}/edit/data-in-transit-protection/protection-between-networks")
			.headers(headers_3)
			.body(RawFileBody("CloudHostingService_0039_request.txt")))
		.pause((sp*23).toInt)
		.exec(http("hosting_service_request_40")
			.post("/suppliers/frameworks/g-cloud-11/submissions/cloud-hosting/${cloud_hosting_service_id}/edit/data-in-transit-protection/protection-within-your-network")
			.headers(headers_3)
			.body(RawFileBody("CloudHostingService_0040_request.txt")))
		.pause((sp*23).toInt)
		.exec(http("hosting_service_request_41")
			.get("/suppliers/frameworks/g-cloud-11/submissions/cloud-hosting/${cloud_hosting_service_id}/edit/asset-protection/data-storage-and-processing-locations")
			.headers(headers_0))
		.pause((sp*11).toInt)
		.exec(http("hosting_service_request_42")
			.post("/suppliers/frameworks/g-cloud-11/submissions/cloud-hosting/${cloud_hosting_service_id}/edit/asset-protection/data-storage-and-processing-locations")
			.headers(headers_3)
			.body(RawFileBody("CloudHostingService_0042_request.txt")))
		.pause((sp*23).toInt)
		.exec(http("hosting_service_request_43")
			.post("/suppliers/frameworks/g-cloud-11/submissions/cloud-hosting/${cloud_hosting_service_id}/edit/asset-protection/datacentre-security-standards")
			.headers(headers_3)
			.body(RawFileBody("CloudHostingService_0043_request.txt")))
		.pause((sp*23).toInt)
		.exec(http("hosting_service_request_44")
			.post("/suppliers/frameworks/g-cloud-11/submissions/cloud-hosting/${cloud_hosting_service_id}/edit/asset-protection/penetration-testing")
			.headers(headers_3)
			.body(RawFileBody("CloudHostingService_0044_request.txt")))
		.pause((sp*23).toInt)
		.exec(http("hosting_service_request_45")
			.post("/suppliers/frameworks/g-cloud-11/submissions/cloud-hosting/${cloud_hosting_service_id}/edit/asset-protection/protection-of-data-at-rest")
			.headers(headers_3)
			.body(RawFileBody("CloudHostingService_0045_request.txt")))
		.pause((sp*23).toInt)
		.exec(http("hosting_service_request_46")
			.post("/suppliers/frameworks/g-cloud-11/submissions/cloud-hosting/${cloud_hosting_service_id}/edit/asset-protection/data-sanitisation-process")
			.headers(headers_3)
			.body(RawFileBody("CloudHostingService_0046_request.txt")))
		.pause((sp*23).toInt)
		.exec(http("hosting_service_request_47")
			.post("/suppliers/frameworks/g-cloud-11/submissions/cloud-hosting/${cloud_hosting_service_id}/edit/asset-protection/equipment-disposal-approach")
			.headers(headers_3)
			.body(RawFileBody("CloudHostingService_0047_request.txt")))
		.pause((sp*23).toInt)
		.exec(http("hosting_service_request_48")
			.get("/suppliers/frameworks/g-cloud-11/submissions/cloud-hosting/${cloud_hosting_service_id}/edit/availability-and-resilience/guaranteed-availability")
			.headers(headers_0))
		.pause((sp*11).toInt)
		.exec(http("hosting_service_request_49")
			.post("/suppliers/frameworks/g-cloud-11/submissions/cloud-hosting/${cloud_hosting_service_id}/edit/availability-and-resilience/guaranteed-availability")
			.headers(headers_3)
			.body(RawFileBody("CloudHostingService_0049_request.txt")))
		.pause((sp*23).toInt)

	val chain_1 = exec(http("hosting_service_request_50")
				.post("/suppliers/frameworks/g-cloud-11/submissions/cloud-hosting/${cloud_hosting_service_id}/edit/availability-and-resilience/approach-to-resilience")
				.headers(headers_3)
				.body(RawFileBody("CloudHostingService_0050_request.txt")))
			.pause((sp*23).toInt)
			.exec(http("hosting_service_request_51")
				.post("/suppliers/frameworks/g-cloud-11/submissions/cloud-hosting/${cloud_hosting_service_id}/edit/availability-and-resilience/outage-reporting")
				.headers(headers_3)
				.body(RawFileBody("CloudHostingService_0051_request.txt")))
			.pause((sp*23).toInt)
			.exec(http("hosting_service_request_52")
				.get("/suppliers/frameworks/g-cloud-11/submissions/cloud-hosting/${cloud_hosting_service_id}/edit/separation-between-users/virtualisation")
				.headers(headers_0))
			.pause((sp*11).toInt)
			.exec(http("hosting_service_request_53")
				.post("/suppliers/frameworks/g-cloud-11/submissions/cloud-hosting/${cloud_hosting_service_id}/edit/separation-between-users/virtualisation")
				.headers(headers_3)
				.body(RawFileBody("CloudHostingService_0053_request.txt")))
			.pause((sp*23).toInt)
			.exec(http("hosting_service_request_54")
				.get("/suppliers/frameworks/g-cloud-11/submissions/cloud-hosting/${cloud_hosting_service_id}/edit/governance/board-level-service-security")
				.headers(headers_0))
			.pause((sp*11).toInt)
			.exec(http("hosting_service_request_55")
				.post("/suppliers/frameworks/g-cloud-11/submissions/cloud-hosting/${cloud_hosting_service_id}/edit/governance/board-level-service-security")
				.headers(headers_3)
				.body(RawFileBody("CloudHostingService_0055_request.txt")))
			.pause((sp*23).toInt)
			.exec(http("hosting_service_request_56")
				.post("/suppliers/frameworks/g-cloud-11/submissions/cloud-hosting/${cloud_hosting_service_id}/edit/governance/security-governance")
				.headers(headers_3)
				.body(RawFileBody("CloudHostingService_0056_request.txt")))
			.pause((sp*23).toInt)
			.exec(http("hosting_service_request_57")
				.post("/suppliers/frameworks/g-cloud-11/submissions/cloud-hosting/${cloud_hosting_service_id}/edit/governance/information-security-policies-and-processes")
				.headers(headers_3)
				.body(RawFileBody("CloudHostingService_0057_request.txt")))
			.pause((sp*23).toInt)
			.exec(http("hosting_service_request_58")
				.get("/suppliers/frameworks/g-cloud-11/submissions/cloud-hosting/${cloud_hosting_service_id}/edit/operational-security/configuration-and-change-management-type")
				.headers(headers_0))
			.pause((sp*11).toInt)
			.exec(http("hosting_service_request_59")
				.post("/suppliers/frameworks/g-cloud-11/submissions/cloud-hosting/${cloud_hosting_service_id}/edit/operational-security/configuration-and-change-management-type")
				.headers(headers_3)
				.body(RawFileBody("CloudHostingService_0059_request.txt")))
			.pause((sp*23).toInt)
			.exec(http("hosting_service_request_60")
				.post("/suppliers/frameworks/g-cloud-11/submissions/cloud-hosting/${cloud_hosting_service_id}/edit/operational-security/configuration-and-change-management-processes")
				.headers(headers_3)
				.body(RawFileBody("CloudHostingService_0060_request.txt")))
			.pause((sp*23).toInt)
			.exec(http("hosting_service_request_61")
				.post("/suppliers/frameworks/g-cloud-11/submissions/cloud-hosting/${cloud_hosting_service_id}/edit/operational-security/vulnerability-management-type")
				.headers(headers_3)
				.body(RawFileBody("CloudHostingService_0061_request.txt")))
			.pause((sp*23).toInt)
			.exec(http("hosting_service_request_62")
				.post("/suppliers/frameworks/g-cloud-11/submissions/cloud-hosting/${cloud_hosting_service_id}/edit/operational-security/vulnerability-management-approach")
				.headers(headers_3)
				.body(RawFileBody("CloudHostingService_0062_request.txt")))
			.pause((sp*23).toInt)
			.exec(http("hosting_service_request_63")
				.post("/suppliers/frameworks/g-cloud-11/submissions/cloud-hosting/${cloud_hosting_service_id}/edit/operational-security/protective-monitoring-type")
				.headers(headers_3)
				.body(RawFileBody("CloudHostingService_0063_request.txt")))
			.pause((sp*23).toInt)
			.exec(http("hosting_service_request_64")
				.post("/suppliers/frameworks/g-cloud-11/submissions/cloud-hosting/${cloud_hosting_service_id}/edit/operational-security/protective-monitoring-approach")
				.headers(headers_3)
				.body(RawFileBody("CloudHostingService_0064_request.txt")))
			.pause((sp*23).toInt)
			.exec(http("hosting_service_request_65")
				.post("/suppliers/frameworks/g-cloud-11/submissions/cloud-hosting/${cloud_hosting_service_id}/edit/operational-security/incident-management-type")
				.headers(headers_3)
				.body(RawFileBody("CloudHostingService_0065_request.txt")))
			.pause((sp*23).toInt)
			.exec(http("hosting_service_request_66")
				.post("/suppliers/frameworks/g-cloud-11/submissions/cloud-hosting/${cloud_hosting_service_id}/edit/operational-security/incident-management-approach")
				.headers(headers_3)
				.body(RawFileBody("CloudHostingService_0066_request.txt")))
			.pause((sp*23).toInt)
			.exec(http("hosting_service_request_67")
				.get("/suppliers/frameworks/g-cloud-11/submissions/cloud-hosting/${cloud_hosting_service_id}/edit/staff-security/staff-security-clearance-checks")
				.headers(headers_0))
			.pause((sp*11).toInt)
			.exec(http("hosting_service_request_68")
				.post("/suppliers/frameworks/g-cloud-11/submissions/cloud-hosting/${cloud_hosting_service_id}/edit/staff-security/staff-security-clearance-checks")
				.headers(headers_3)
				.body(RawFileBody("CloudHostingService_0068_request.txt")))
			.pause((sp*23).toInt)
			.exec(http("hosting_service_request_69")
				.post("/suppliers/frameworks/g-cloud-11/submissions/cloud-hosting/${cloud_hosting_service_id}/edit/staff-security/government-security-clearances")
				.headers(headers_3)
				.body(RawFileBody("CloudHostingService_0069_request.txt")))
			.pause((sp*23).toInt)
			.exec(http("hosting_service_request_70")
				.get("/suppliers/frameworks/g-cloud-11/submissions/cloud-hosting/${cloud_hosting_service_id}/edit/secure-development/secure-development")
				.headers(headers_0))
			.pause((sp*11).toInt)
			.exec(http("hosting_service_request_71")
				.post("/suppliers/frameworks/g-cloud-11/submissions/cloud-hosting/${cloud_hosting_service_id}/edit/secure-development/secure-development")
				.headers(headers_3)
				.body(RawFileBody("CloudHostingService_0071_request.txt")))
			.pause((sp*23).toInt)
			.exec(http("hosting_service_request_72")
				.get("/suppliers/frameworks/g-cloud-11/submissions/cloud-hosting/${cloud_hosting_service_id}/edit/identity-and-authentication/user-authentication")
				.headers(headers_0))
			.pause((sp*11).toInt)
			.exec(http("hosting_service_request_73")
				.post("/suppliers/frameworks/g-cloud-11/submissions/cloud-hosting/${cloud_hosting_service_id}/edit/identity-and-authentication/user-authentication")
				.headers(headers_3)
				.body(RawFileBody("CloudHostingService_0073_request.txt")))
			.pause((sp*23).toInt)
			.exec(http("hosting_service_request_74")
				.post("/suppliers/frameworks/g-cloud-11/submissions/cloud-hosting/${cloud_hosting_service_id}/edit/identity-and-authentication/access-restriction-management-and-support")
				.headers(headers_3)
				.body(RawFileBody("CloudHostingService_0074_request.txt")))
			.pause((sp*23).toInt)
			.exec(http("hosting_service_request_75")
				.post("/suppliers/frameworks/g-cloud-11/submissions/cloud-hosting/${cloud_hosting_service_id}/edit/identity-and-authentication/access-restriction-testing")
				.headers(headers_3)
				.body(RawFileBody("CloudHostingService_0075_request.txt")))
			.pause((sp*23).toInt)
			.exec(http("hosting_service_request_76")
				.post("/suppliers/frameworks/g-cloud-11/submissions/cloud-hosting/${cloud_hosting_service_id}/edit/identity-and-authentication/management-access")
				.headers(headers_3)
				.body(RawFileBody("CloudHostingService_0076_request.txt")))
			.pause((sp*23).toInt)
			.exec(http("hosting_service_request_77")
				.post("/suppliers/frameworks/g-cloud-11/submissions/cloud-hosting/${cloud_hosting_service_id}/edit/identity-and-authentication/devices-users-manage-the-service-through")
				.headers(headers_3)
				.body(RawFileBody("CloudHostingService_0077_request.txt")))
			.pause((sp*23).toInt)
			.exec(http("hosting_service_request_78")
				.get("/suppliers/frameworks/g-cloud-11/submissions/cloud-hosting/${cloud_hosting_service_id}/edit/audit-information-for-users/audit-for-buyers-users-actions")
				.headers(headers_0))
			.pause((sp*11).toInt)
			.exec(http("hosting_service_request_79")
				.post("/suppliers/frameworks/g-cloud-11/submissions/cloud-hosting/${cloud_hosting_service_id}/edit/audit-information-for-users/audit-for-buyers-users-actions")
				.headers(headers_3)
				.body(RawFileBody("CloudHostingService_0079_request.txt")))
			.pause((sp*23).toInt)
			.exec(http("hosting_service_request_80")
				.post("/suppliers/frameworks/g-cloud-11/submissions/cloud-hosting/${cloud_hosting_service_id}/edit/audit-information-for-users/audit-for-suppliers-users-actions")
				.headers(headers_3)
				.body(RawFileBody("CloudHostingService_0080_request.txt")))
			.pause((sp*23).toInt)
			.exec(http("hosting_service_request_81")
				.post("/suppliers/frameworks/g-cloud-11/submissions/cloud-hosting/${cloud_hosting_service_id}/edit/audit-information-for-users/how-long-system-logs-stored")
				.headers(headers_3)
				.body(RawFileBody("CloudHostingService_0081_request.txt")))
			.pause((sp*23).toInt)
			.exec(http("hosting_service_request_82")
				.get("/suppliers/frameworks/g-cloud-11/submissions/cloud-hosting/${cloud_hosting_service_id}/edit/standards-and-certifications/iso-iec-27001-certification")
				.headers(headers_0))
			.pause((sp*11).toInt)
			.exec(http("hosting_service_request_83")
				.post("/suppliers/frameworks/g-cloud-11/submissions/cloud-hosting/${cloud_hosting_service_id}/edit/standards-and-certifications/iso-iec-27001-certification")
				.headers(headers_3)
				.body(RawFileBody("CloudHostingService_0083_request.txt")))
			.pause((sp*23).toInt)
			.exec(http("hosting_service_request_84")
				.post("/suppliers/frameworks/g-cloud-11/submissions/cloud-hosting/${cloud_hosting_service_id}/edit/standards-and-certifications/iso-28000-2007-certification")
				.headers(headers_3)
				.body(RawFileBody("CloudHostingService_0084_request.txt")))
			.pause((sp*23).toInt)
			.exec(http("hosting_service_request_85")
				.post("/suppliers/frameworks/g-cloud-11/submissions/cloud-hosting/${cloud_hosting_service_id}/edit/standards-and-certifications/csa-star-certification")
				.headers(headers_3)
				.body(RawFileBody("CloudHostingService_0085_request.txt")))
			.pause((sp*23).toInt)
			.exec(http("hosting_service_request_86")
				.post("/suppliers/frameworks/g-cloud-11/submissions/cloud-hosting/${cloud_hosting_service_id}/edit/standards-and-certifications/pci-certification")
				.headers(headers_3)
				.body(RawFileBody("CloudHostingService_0086_request.txt")))
			.pause((sp*23).toInt)
			.exec(http("hosting_service_request_87")
				.post("/suppliers/frameworks/g-cloud-11/submissions/cloud-hosting/${cloud_hosting_service_id}/edit/standards-and-certifications/other-security-certifications")
				.headers(headers_3)
				.body(RawFileBody("CloudHostingService_0087_request.txt")))
			.pause((sp*23).toInt)
			.exec(http("hosting_service_request_88")
				.get("/suppliers/frameworks/g-cloud-11/submissions/cloud-hosting/${cloud_hosting_service_id}/edit/energy-efficiency/energy-efficient-datacentres")
				.headers(headers_0))
			.pause((sp*11).toInt)
			.exec(http("hosting_service_request_89")
				.post("/suppliers/frameworks/g-cloud-11/submissions/cloud-hosting/${cloud_hosting_service_id}/edit/energy-efficiency/energy-efficient-datacentres")
				.headers(headers_3)
				.body(RawFileBody("CloudHostingService_0089_request.txt")))
			.pause((sp*23).toInt)
			.exec(http("hosting_service_request_90")
				.get("/suppliers/frameworks/g-cloud-11/submissions/cloud-hosting/${cloud_hosting_service_id}/edit/pricing/price")
				.headers(headers_0))
			.pause((sp*11).toInt)
			.exec(http("hosting_service_request_91")
				.post("/suppliers/frameworks/g-cloud-11/submissions/cloud-hosting/${cloud_hosting_service_id}/edit/pricing/price")
				.headers(headers_3)
				.body(RawFileBody("CloudHostingService_0091_request.txt")))
			.pause((sp*23).toInt)
			.exec(http("hosting_service_request_92")
				.post("/suppliers/frameworks/g-cloud-11/submissions/cloud-hosting/${cloud_hosting_service_id}/edit/pricing/education-pricing")
				.headers(headers_3)
				.body(RawFileBody("CloudHostingService_0092_request.txt")))
			.pause((sp*23).toInt)
			.exec(http("hosting_service_request_93")
				.post("/suppliers/frameworks/g-cloud-11/submissions/cloud-hosting/${cloud_hosting_service_id}/edit/pricing/free-or-trial-versions")
				.headers(headers_3)
				.body(RawFileBody("CloudHostingService_0093_request.txt")))
			.pause((sp*23).toInt)
			.exec(http("hosting_service_request_94")
				.get("/suppliers/frameworks/g-cloud-11/submissions/cloud-hosting/${cloud_hosting_service_id}/edit/documents/service-definition-document-url")
				.headers(headers_0))
			.pause((sp*11).toInt)
			.exec(http("hosting_service_request_95")
				.post("/suppliers/frameworks/g-cloud-11/submissions/cloud-hosting/${cloud_hosting_service_id}/edit/documents/service-definition-document-url")
				.headers(headers_3)
				.body(RawFileBody("CloudHostingService_0095_request.txt")))
			.pause((sp*23).toInt)
			.exec(http("hosting_service_request_96")
				.post("/suppliers/frameworks/g-cloud-11/submissions/cloud-hosting/${cloud_hosting_service_id}/edit/documents/terms-and-conditions-document-url")
				.headers(headers_3)
				.body(RawFileBody("CloudHostingService_0096_request.txt")))
			.pause((sp*23).toInt)
			.exec(http("hosting_service_request_97")
				.post("/suppliers/frameworks/g-cloud-11/submissions/cloud-hosting/${cloud_hosting_service_id}/edit/documents/pricing-document-url")
				.headers(headers_3)
				.body(RawFileBody("CloudHostingService_0097_request.txt")))
			.pause((sp*23).toInt)
			.exec(http("hosting_service_request_98")
				.post("/suppliers/frameworks/g-cloud-11/submissions/cloud-hosting/${cloud_hosting_service_id}/edit/documents/sfia-rate-document-url")
				.headers(headers_3)
				.body(RawFileBody("CloudHostingService_0098_request.txt")))
			.pause((sp*23).toInt)
			.exec(http("hosting_service_request_99")
				.post("/suppliers/frameworks/g-cloud-11/submissions/cloud-hosting/${cloud_hosting_service_id}/complete")
				.headers(headers_99))
			.pause((sp*11).toInt)

	val cloudHostingService = exec(
		exitBlockOnFail {
			pause((sp*11).toInt)
			.exec(chain_0, chain_1)
		}
	)
}
