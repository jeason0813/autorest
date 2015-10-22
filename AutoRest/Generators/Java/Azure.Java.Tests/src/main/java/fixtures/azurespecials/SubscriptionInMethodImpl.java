/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 * 
 * Code generated by Microsoft (R) AutoRest Code Generator 0.12.0.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.azurespecials;

import com.google.common.reflect.TypeToken;
import com.microsoft.rest.CloudError;
import com.microsoft.rest.Resource;
import com.microsoft.rest.SubResource;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceException;
import com.microsoft.rest.ServiceResponse;
import com.microsoft.rest.ServiceResponseBuilder;
import com.microsoft.rest.ServiceResponseCallback;
import com.microsoft.rest.ServiceResponseEmptyCallback;
import com.squareup.okhttp.ResponseBody;
import retrofit.Retrofit;
import retrofit.Call;
import retrofit.Response;
import java.io.IOException;
import retrofit.http.POST;
import retrofit.http.Path;
import retrofit.http.Header;

public class SubscriptionInMethodImpl implements SubscriptionInMethod {
    private SubscriptionInMethodService service;
    AutoRestAzureSpecialParametersTestClient client;

    public SubscriptionInMethodImpl(Retrofit retrofit, AutoRestAzureSpecialParametersTestClient client) {
        this.service = retrofit.create(SubscriptionInMethodService.class);
        this.client = client;
    }

    /**
     * POST method with subscriptionId modeled in the method.  pass in subscription id = '1234-5678-9012-3456' to succeed
     *
     * @param subscriptionId This should appear as a method parameter, use value '1234-5678-9012-3456'
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    public ServiceResponse<Void> postMethodLocalValid(String subscriptionId) throws ServiceException {
        if (subscriptionId == null) {
            throw new ServiceException(
                new IllegalArgumentException("Parameter subscriptionId is required and cannot be null."));
        }
        try {
            Call<ResponseBody> call = service.postMethodLocalValid(subscriptionId, this.client.getAcceptLanguage());
            return postMethodLocalValidDelegate(call.execute(), null);
        } catch (ServiceException ex) {
            throw ex;
        } catch (Exception ex) {
            throw new ServiceException(ex);
        }
    }

    /**
     * POST method with subscriptionId modeled in the method.  pass in subscription id = '1234-5678-9012-3456' to succeed
     *
     * @param subscriptionId This should appear as a method parameter, use value '1234-5678-9012-3456'
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    public Call<ResponseBody> postMethodLocalValidAsync(String subscriptionId, final ServiceCallback<Void> serviceCallback) {
        if (subscriptionId == null) {
            serviceCallback.failure(new ServiceException(
                new IllegalArgumentException("Parameter subscriptionId is required and cannot be null.")));
        }
        Call<ResponseBody> call = service.postMethodLocalValid(subscriptionId, this.client.getAcceptLanguage());
        call.enqueue(new ServiceResponseCallback<Void>(serviceCallback) {
            @Override
            public void onResponse(Response<ResponseBody> response, Retrofit retrofit) {
                try {
                    serviceCallback.success(postMethodLocalValidDelegate(response, retrofit));
                } catch (ServiceException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return call;
    }

    private ServiceResponse<Void> postMethodLocalValidDelegate(Response<ResponseBody> response, Retrofit retrofit) throws ServiceException {
        return new ServiceResponseBuilder<Void>()
                .register(200, new TypeToken<Void>(){}.getType())
                .registerError(new TypeToken<Error>(){}.getType())
                .build(response, retrofit);
    }

    /**
     * POST method with subscriptionId modeled in the method.  pass in subscription id = null, client-side validation should prevent you from making this call
     *
     * @param subscriptionId This should appear as a method parameter, use value null, client-side validation should prvenet the call
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    public ServiceResponse<Void> postMethodLocalNull(String subscriptionId) throws ServiceException {
        if (subscriptionId == null) {
            throw new ServiceException(
                new IllegalArgumentException("Parameter subscriptionId is required and cannot be null."));
        }
        try {
            Call<ResponseBody> call = service.postMethodLocalNull(subscriptionId, this.client.getAcceptLanguage());
            return postMethodLocalNullDelegate(call.execute(), null);
        } catch (ServiceException ex) {
            throw ex;
        } catch (Exception ex) {
            throw new ServiceException(ex);
        }
    }

    /**
     * POST method with subscriptionId modeled in the method.  pass in subscription id = null, client-side validation should prevent you from making this call
     *
     * @param subscriptionId This should appear as a method parameter, use value null, client-side validation should prvenet the call
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    public Call<ResponseBody> postMethodLocalNullAsync(String subscriptionId, final ServiceCallback<Void> serviceCallback) {
        if (subscriptionId == null) {
            serviceCallback.failure(new ServiceException(
                new IllegalArgumentException("Parameter subscriptionId is required and cannot be null.")));
        }
        Call<ResponseBody> call = service.postMethodLocalNull(subscriptionId, this.client.getAcceptLanguage());
        call.enqueue(new ServiceResponseCallback<Void>(serviceCallback) {
            @Override
            public void onResponse(Response<ResponseBody> response, Retrofit retrofit) {
                try {
                    serviceCallback.success(postMethodLocalNullDelegate(response, retrofit));
                } catch (ServiceException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return call;
    }

    private ServiceResponse<Void> postMethodLocalNullDelegate(Response<ResponseBody> response, Retrofit retrofit) throws ServiceException {
        return new ServiceResponseBuilder<Void>()
                .register(200, new TypeToken<Void>(){}.getType())
                .registerError(new TypeToken<Error>(){}.getType())
                .build(response, retrofit);
    }

    /**
     * POST method with subscriptionId modeled in the method.  pass in subscription id = '1234-5678-9012-3456' to succeed
     *
     * @param subscriptionId Should appear as a method parameter -use value '1234-5678-9012-3456'
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    public ServiceResponse<Void> postPathLocalValid(String subscriptionId) throws ServiceException {
        if (subscriptionId == null) {
            throw new ServiceException(
                new IllegalArgumentException("Parameter subscriptionId is required and cannot be null."));
        }
        try {
            Call<ResponseBody> call = service.postPathLocalValid(subscriptionId, this.client.getAcceptLanguage());
            return postPathLocalValidDelegate(call.execute(), null);
        } catch (ServiceException ex) {
            throw ex;
        } catch (Exception ex) {
            throw new ServiceException(ex);
        }
    }

    /**
     * POST method with subscriptionId modeled in the method.  pass in subscription id = '1234-5678-9012-3456' to succeed
     *
     * @param subscriptionId Should appear as a method parameter -use value '1234-5678-9012-3456'
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    public Call<ResponseBody> postPathLocalValidAsync(String subscriptionId, final ServiceCallback<Void> serviceCallback) {
        if (subscriptionId == null) {
            serviceCallback.failure(new ServiceException(
                new IllegalArgumentException("Parameter subscriptionId is required and cannot be null.")));
        }
        Call<ResponseBody> call = service.postPathLocalValid(subscriptionId, this.client.getAcceptLanguage());
        call.enqueue(new ServiceResponseCallback<Void>(serviceCallback) {
            @Override
            public void onResponse(Response<ResponseBody> response, Retrofit retrofit) {
                try {
                    serviceCallback.success(postPathLocalValidDelegate(response, retrofit));
                } catch (ServiceException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return call;
    }

    private ServiceResponse<Void> postPathLocalValidDelegate(Response<ResponseBody> response, Retrofit retrofit) throws ServiceException {
        return new ServiceResponseBuilder<Void>()
                .register(200, new TypeToken<Void>(){}.getType())
                .registerError(new TypeToken<Error>(){}.getType())
                .build(response, retrofit);
    }

    /**
     * POST method with subscriptionId modeled in the method.  pass in subscription id = '1234-5678-9012-3456' to succeed
     *
     * @param subscriptionId The subscriptionId, which appears in the path, the value is always '1234-5678-9012-3456'
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    public ServiceResponse<Void> postSwaggerLocalValid(String subscriptionId) throws ServiceException {
        if (subscriptionId == null) {
            throw new ServiceException(
                new IllegalArgumentException("Parameter subscriptionId is required and cannot be null."));
        }
        try {
            Call<ResponseBody> call = service.postSwaggerLocalValid(subscriptionId, this.client.getAcceptLanguage());
            return postSwaggerLocalValidDelegate(call.execute(), null);
        } catch (ServiceException ex) {
            throw ex;
        } catch (Exception ex) {
            throw new ServiceException(ex);
        }
    }

    /**
     * POST method with subscriptionId modeled in the method.  pass in subscription id = '1234-5678-9012-3456' to succeed
     *
     * @param subscriptionId The subscriptionId, which appears in the path, the value is always '1234-5678-9012-3456'
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    public Call<ResponseBody> postSwaggerLocalValidAsync(String subscriptionId, final ServiceCallback<Void> serviceCallback) {
        if (subscriptionId == null) {
            serviceCallback.failure(new ServiceException(
                new IllegalArgumentException("Parameter subscriptionId is required and cannot be null.")));
        }
        Call<ResponseBody> call = service.postSwaggerLocalValid(subscriptionId, this.client.getAcceptLanguage());
        call.enqueue(new ServiceResponseCallback<Void>(serviceCallback) {
            @Override
            public void onResponse(Response<ResponseBody> response, Retrofit retrofit) {
                try {
                    serviceCallback.success(postSwaggerLocalValidDelegate(response, retrofit));
                } catch (ServiceException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return call;
    }

    private ServiceResponse<Void> postSwaggerLocalValidDelegate(Response<ResponseBody> response, Retrofit retrofit) throws ServiceException {
        return new ServiceResponseBuilder<Void>()
                .register(200, new TypeToken<Void>(){}.getType())
                .registerError(new TypeToken<Error>(){}.getType())
                .build(response, retrofit);
    }

}
