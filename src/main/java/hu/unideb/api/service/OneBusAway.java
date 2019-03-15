package hu.unideb.api.service;

import hu.unideb.api.responses.*;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

/**
 * Retrofit API for OneBusAway.
 *
 * @see <a href="OneBusAway">http://developer.onebusaway.org/modules/onebusaway-application-modules/1.1.15/api/where/index.html</a>
 */
public interface OneBusAway {

    //AgencyWithCoverage
    @GET("api/where/agencies-with-coverage.json")
    Call<AgenciesWithCoverageResponse> getAgencies(@Query("key") String apiKey);

    //Route
    @GET("api/where/route/{routeId}.json")
    Call<RouteResponse> getRouteById(@Path("routeId") String routeId, @Query("key") String apiKey);

    //RouteIdsForAgency
    @GET("api/where/route-ids-for-agency/{agencyId}.json")
    Call<RouteIdsForAgencyResponse> getRouteIdsForAgency(@Path("agencyId") String agencyId, @Query("key") String apiKey);

    //RoutesForAgency
    @GET("api/where/routes-for-agency/{agencyId}.json")
    Call<RoutesForAgencyResponse> getRoutesForAgency(@Path("agencyId") String agencyId, @Query("key") String apiKey);

    //StopsForRoute
    @GET("api/where/stops-for-route/{routeId}.json")
    Call<StopsForRouteResponse> getStopsForRoute(@Path("routeId") String routeId, @Query("key") String apiKey,
                                                 @Query("includePolylines") boolean includePolylines);

    //ArrivalsAndDeparturesForStop
    @GET("api/where/arrivals-and-departures-for-stop/{agencyId}_{stopId}.json")
    Call<ArrivalsAndDeparturesForStopResponse> getArrivalsAndDeparturesForStop(@Path("agencyId") String agencyId, @Path("stopId") String stopId, @Query("key") String apiKey,
                                                                               @Query("minutesBefore") Integer minutesBefore, @Query("minutesAfter") Integer minutesAfter);

    //ScheduleForStop with a specified date
    @GET("api/where/schedule-for-stop/{stopId}.json")
    Call<ScheduleForStopResponse> getScheduleForStopWithDate(@Path("stopId") String stopId, @Query("key") String apiKey, @Query("date") String date);

    //StopsForLocation
    @GET("api/where/stops-for-location.json")
    Call<StopsForLocationResponse> getStopsForLocation(@Query("key") String apiKey, @Query("lat") double latitude, @Query("lon") double longitude);
}
