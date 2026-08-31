.class public final LO3/C0;
.super Lcom/google/android/gms/internal/measurement/x;
.source "SourceFile"

# interfaces
.implements LO3/I;


# instance fields
.field public final c:LO3/T1;

.field public d:Ljava/lang/Boolean;

.field public e:Ljava/lang/String;


# direct methods
.method public constructor <init>(LO3/T1;)V
    .locals 1

    .line 1
    const-string v0, "com.google.android.gms.measurement.internal.IMeasurementService"

    .line 2
    .line 3
    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/measurement/x;-><init>(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-static {p1}, Lx3/A;->g(Ljava/lang/Object;)V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, LO3/C0;->c:LO3/T1;

    .line 10
    .line 11
    const/4 p1, 0x0

    .line 12
    iput-object p1, p0, LO3/C0;->e:Ljava/lang/String;

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final B(LO3/a2;)V
    .locals 2

    .line 1
    invoke-virtual {p0, p1}, LO3/C0;->K(LO3/a2;)V

    .line 2
    .line 3
    .line 4
    new-instance v0, LO3/v0;

    .line 5
    .line 6
    const/4 v1, 0x2

    .line 7
    invoke-direct {v0, p0, p1, v1}, LO3/v0;-><init>(LO3/C0;LO3/a2;I)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0, v0}, LO3/C0;->M(Ljava/lang/Runnable;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public final C(LO3/a2;)V
    .locals 2

    .line 1
    iget-object v0, p1, LO3/a2;->q:Ljava/lang/String;

    .line 2
    .line 3
    invoke-static {v0}, Lx3/A;->d(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p1, LO3/a2;->I:Ljava/lang/String;

    .line 7
    .line 8
    invoke-static {v0}, Lx3/A;->g(Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    new-instance v0, LO3/v0;

    .line 12
    .line 13
    const/4 v1, 0x5

    .line 14
    invoke-direct {v0, p0, p1, v1}, LO3/v0;-><init>(LO3/C0;LO3/a2;I)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0, v0}, LO3/C0;->J(Ljava/lang/Runnable;)V

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method public final D(LO3/a2;LO3/M1;LO3/M;)V
    .locals 6

    .line 1
    invoke-virtual {p0, p1}, LO3/C0;->K(LO3/a2;)V

    .line 2
    .line 3
    .line 4
    iget-object v2, p1, LO3/a2;->q:Ljava/lang/String;

    .line 5
    .line 6
    invoke-static {v2}, Lx3/A;->g(Ljava/lang/Object;)V

    .line 7
    .line 8
    .line 9
    iget-object p1, p0, LO3/C0;->c:LO3/T1;

    .line 10
    .line 11
    invoke-virtual {p1}, LO3/T1;->c()LO3/p0;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    new-instance v0, LO3/B0;

    .line 16
    .line 17
    const/4 v5, 0x0

    .line 18
    move-object v1, p0

    .line 19
    move-object v3, p2

    .line 20
    move-object v4, p3

    .line 21
    invoke-direct/range {v0 .. v5}, LO3/B0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {p1, v0}, LO3/p0;->x(Ljava/lang/Runnable;)V

    .line 25
    .line 26
    .line 27
    return-void
.end method

.method public final E(LO3/a2;Landroid/os/Bundle;)V
    .locals 2

    .line 1
    invoke-virtual {p0, p1}, LO3/C0;->K(LO3/a2;)V

    .line 2
    .line 3
    .line 4
    iget-object v0, p1, LO3/a2;->q:Ljava/lang/String;

    .line 5
    .line 6
    invoke-static {v0}, Lx3/A;->g(Ljava/lang/Object;)V

    .line 7
    .line 8
    .line 9
    new-instance v1, LO3/B0;

    .line 10
    .line 11
    invoke-direct {v1, p0, p2, v0, p1}, LO3/B0;-><init>(LO3/C0;Landroid/os/Bundle;Ljava/lang/String;LO3/a2;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0, v1}, LO3/C0;->M(Ljava/lang/Runnable;)V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public final F(LO3/a2;)V
    .locals 2

    .line 1
    iget-object v0, p1, LO3/a2;->q:Ljava/lang/String;

    .line 2
    .line 3
    invoke-static {v0}, Lx3/A;->d(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p1, LO3/a2;->I:Ljava/lang/String;

    .line 7
    .line 8
    invoke-static {v0}, Lx3/A;->g(Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    new-instance v0, LO3/v0;

    .line 12
    .line 13
    const/4 v1, 0x4

    .line 14
    invoke-direct {v0, p0, p1, v1}, LO3/v0;-><init>(LO3/C0;LO3/a2;I)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0, v0}, LO3/C0;->J(Ljava/lang/Runnable;)V

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method public final H(LO3/v;LO3/a2;)V
    .locals 2

    .line 1
    invoke-static {p1}, Lx3/A;->g(Ljava/lang/Object;)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0, p2}, LO3/C0;->K(LO3/a2;)V

    .line 5
    .line 6
    .line 7
    new-instance v0, LO3/x0;

    .line 8
    .line 9
    const/4 v1, 0x1

    .line 10
    invoke-direct {v0, p0, p1, p2, v1}, LO3/x0;-><init>(LO3/C0;Ly3/a;Ljava/lang/Object;I)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0, v0}, LO3/C0;->M(Ljava/lang/Runnable;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public final I(ILandroid/os/Parcel;Landroid/os/Parcel;)Z
    .locals 11

    .line 1
    const/4 v0, 0x2

    .line 2
    iget-object v1, p0, LO3/C0;->c:LO3/T1;

    .line 3
    .line 4
    const/4 v2, 0x0

    .line 5
    const/4 v3, 0x0

    .line 6
    const/4 v4, 0x1

    .line 7
    packed-switch p1, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    :pswitch_0
    return v3

    .line 11
    :pswitch_1
    sget-object p1, LO3/a2;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 12
    .line 13
    invoke-static {p2, p1}, Lcom/google/android/gms/internal/measurement/y;->a(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    check-cast p1, LO3/a2;

    .line 18
    .line 19
    sget-object v1, Landroid/os/Bundle;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 20
    .line 21
    invoke-static {p2, v1}, Lcom/google/android/gms/internal/measurement/y;->a(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    check-cast v1, Landroid/os/Bundle;

    .line 26
    .line 27
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    .line 28
    .line 29
    .line 30
    move-result-object v3

    .line 31
    if-nez v3, :cond_0

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_0
    const-string v2, "com.google.android.gms.measurement.internal.ITriggerUrisCallback"

    .line 35
    .line 36
    invoke-interface {v3, v2}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    .line 37
    .line 38
    .line 39
    move-result-object v5

    .line 40
    instance-of v6, v5, LO3/K;

    .line 41
    .line 42
    if-eqz v6, :cond_1

    .line 43
    .line 44
    move-object v2, v5

    .line 45
    check-cast v2, LO3/K;

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_1
    new-instance v5, LO3/J;

    .line 49
    .line 50
    invoke-direct {v5, v3, v2, v0}, LI3/a;-><init>(Landroid/os/IBinder;Ljava/lang/String;I)V

    .line 51
    .line 52
    .line 53
    move-object v2, v5

    .line 54
    :goto_0
    invoke-static {p2}, Lcom/google/android/gms/internal/measurement/y;->d(Landroid/os/Parcel;)V

    .line 55
    .line 56
    .line 57
    invoke-virtual {p0, p1, v1, v2}, LO3/C0;->y(LO3/a2;Landroid/os/Bundle;LO3/K;)V

    .line 58
    .line 59
    .line 60
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 61
    .line 62
    .line 63
    return v4

    .line 64
    :pswitch_2
    sget-object p1, LO3/a2;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 65
    .line 66
    invoke-static {p2, p1}, Lcom/google/android/gms/internal/measurement/y;->a(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 67
    .line 68
    .line 69
    move-result-object p1

    .line 70
    check-cast p1, LO3/a2;

    .line 71
    .line 72
    sget-object v0, LO3/d;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 73
    .line 74
    invoke-static {p2, v0}, Lcom/google/android/gms/internal/measurement/y;->a(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 75
    .line 76
    .line 77
    move-result-object v0

    .line 78
    check-cast v0, LO3/d;

    .line 79
    .line 80
    invoke-static {p2}, Lcom/google/android/gms/internal/measurement/y;->d(Landroid/os/Parcel;)V

    .line 81
    .line 82
    .line 83
    invoke-virtual {p0, p1, v0}, LO3/C0;->p(LO3/a2;LO3/d;)V

    .line 84
    .line 85
    .line 86
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 87
    .line 88
    .line 89
    return v4

    .line 90
    :pswitch_3
    sget-object p1, LO3/a2;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 91
    .line 92
    invoke-static {p2, p1}, Lcom/google/android/gms/internal/measurement/y;->a(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 93
    .line 94
    .line 95
    move-result-object p1

    .line 96
    check-cast p1, LO3/a2;

    .line 97
    .line 98
    sget-object v1, LO3/M1;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 99
    .line 100
    invoke-static {p2, v1}, Lcom/google/android/gms/internal/measurement/y;->a(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 101
    .line 102
    .line 103
    move-result-object v1

    .line 104
    check-cast v1, LO3/M1;

    .line 105
    .line 106
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    .line 107
    .line 108
    .line 109
    move-result-object v3

    .line 110
    if-nez v3, :cond_2

    .line 111
    .line 112
    goto :goto_1

    .line 113
    :cond_2
    const-string v2, "com.google.android.gms.measurement.internal.IUploadBatchesCallback"

    .line 114
    .line 115
    invoke-interface {v3, v2}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    .line 116
    .line 117
    .line 118
    move-result-object v5

    .line 119
    instance-of v6, v5, LO3/M;

    .line 120
    .line 121
    if-eqz v6, :cond_3

    .line 122
    .line 123
    move-object v2, v5

    .line 124
    check-cast v2, LO3/M;

    .line 125
    .line 126
    goto :goto_1

    .line 127
    :cond_3
    new-instance v5, LO3/L;

    .line 128
    .line 129
    invoke-direct {v5, v3, v2, v0}, LI3/a;-><init>(Landroid/os/IBinder;Ljava/lang/String;I)V

    .line 130
    .line 131
    .line 132
    move-object v2, v5

    .line 133
    :goto_1
    invoke-static {p2}, Lcom/google/android/gms/internal/measurement/y;->d(Landroid/os/Parcel;)V

    .line 134
    .line 135
    .line 136
    invoke-virtual {p0, p1, v1, v2}, LO3/C0;->D(LO3/a2;LO3/M1;LO3/M;)V

    .line 137
    .line 138
    .line 139
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 140
    .line 141
    .line 142
    return v4

    .line 143
    :pswitch_4
    sget-object p1, LO3/a2;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 144
    .line 145
    invoke-static {p2, p1}, Lcom/google/android/gms/internal/measurement/y;->a(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 146
    .line 147
    .line 148
    move-result-object p1

    .line 149
    check-cast p1, LO3/a2;

    .line 150
    .line 151
    invoke-static {p2}, Lcom/google/android/gms/internal/measurement/y;->d(Landroid/os/Parcel;)V

    .line 152
    .line 153
    .line 154
    invoke-virtual {p0, p1}, LO3/C0;->q(LO3/a2;)V

    .line 155
    .line 156
    .line 157
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 158
    .line 159
    .line 160
    return v4

    .line 161
    :pswitch_5
    sget-object p1, LO3/a2;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 162
    .line 163
    invoke-static {p2, p1}, Lcom/google/android/gms/internal/measurement/y;->a(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 164
    .line 165
    .line 166
    move-result-object p1

    .line 167
    check-cast p1, LO3/a2;

    .line 168
    .line 169
    invoke-static {p2}, Lcom/google/android/gms/internal/measurement/y;->d(Landroid/os/Parcel;)V

    .line 170
    .line 171
    .line 172
    invoke-virtual {p0, p1}, LO3/C0;->C(LO3/a2;)V

    .line 173
    .line 174
    .line 175
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 176
    .line 177
    .line 178
    return v4

    .line 179
    :pswitch_6
    sget-object p1, LO3/a2;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 180
    .line 181
    invoke-static {p2, p1}, Lcom/google/android/gms/internal/measurement/y;->a(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 182
    .line 183
    .line 184
    move-result-object p1

    .line 185
    check-cast p1, LO3/a2;

    .line 186
    .line 187
    invoke-static {p2}, Lcom/google/android/gms/internal/measurement/y;->d(Landroid/os/Parcel;)V

    .line 188
    .line 189
    .line 190
    invoke-virtual {p0, p1}, LO3/C0;->s(LO3/a2;)V

    .line 191
    .line 192
    .line 193
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 194
    .line 195
    .line 196
    return v4

    .line 197
    :pswitch_7
    sget-object p1, LO3/a2;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 198
    .line 199
    invoke-static {p2, p1}, Lcom/google/android/gms/internal/measurement/y;->a(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 200
    .line 201
    .line 202
    move-result-object p1

    .line 203
    check-cast p1, LO3/a2;

    .line 204
    .line 205
    sget-object v0, Landroid/os/Bundle;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 206
    .line 207
    invoke-static {p2, v0}, Lcom/google/android/gms/internal/measurement/y;->a(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 208
    .line 209
    .line 210
    move-result-object v0

    .line 211
    check-cast v0, Landroid/os/Bundle;

    .line 212
    .line 213
    invoke-static {p2}, Lcom/google/android/gms/internal/measurement/y;->d(Landroid/os/Parcel;)V

    .line 214
    .line 215
    .line 216
    invoke-virtual {p0, p1}, LO3/C0;->K(LO3/a2;)V

    .line 217
    .line 218
    .line 219
    iget-object p2, p1, LO3/a2;->q:Ljava/lang/String;

    .line 220
    .line 221
    invoke-static {p2}, Lx3/A;->g(Ljava/lang/Object;)V

    .line 222
    .line 223
    .line 224
    invoke-virtual {v1}, LO3/T1;->d0()LO3/g;

    .line 225
    .line 226
    .line 227
    move-result-object v5

    .line 228
    sget-object v6, LO3/F;->Y0:LO3/E;

    .line 229
    .line 230
    invoke-virtual {v5, v2, v6}, LO3/g;->y(Ljava/lang/String;LO3/E;)Z

    .line 231
    .line 232
    .line 233
    move-result v2

    .line 234
    const-string v5, "Failed to get trigger URIs. appId"

    .line 235
    .line 236
    if-eqz v2, :cond_4

    .line 237
    .line 238
    invoke-virtual {v1}, LO3/T1;->c()LO3/p0;

    .line 239
    .line 240
    .line 241
    move-result-object v2

    .line 242
    new-instance v6, LO3/z0;

    .line 243
    .line 244
    invoke-direct {v6, p0, p1, v0, v3}, LO3/z0;-><init>(LO3/C0;LO3/a2;Landroid/os/Bundle;I)V

    .line 245
    .line 246
    .line 247
    invoke-virtual {v2, v6}, LO3/p0;->w(Ljava/util/concurrent/Callable;)LO3/n0;

    .line 248
    .line 249
    .line 250
    move-result-object p1

    .line 251
    :try_start_0
    sget-object v0, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 252
    .line 253
    const-wide/16 v2, 0x2710

    .line 254
    .line 255
    invoke-virtual {p1, v2, v3, v0}, Ljava/util/concurrent/FutureTask;->get(JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;

    .line 256
    .line 257
    .line 258
    move-result-object p1

    .line 259
    check-cast p1, Ljava/util/List;
    :try_end_0
    .catch Ljava/util/concurrent/TimeoutException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_0 .. :try_end_0} :catch_0

    .line 260
    .line 261
    goto :goto_6

    .line 262
    :catch_0
    move-exception v0

    .line 263
    :goto_2
    move-object p1, v0

    .line 264
    goto :goto_3

    .line 265
    :catch_1
    move-exception v0

    .line 266
    goto :goto_2

    .line 267
    :catch_2
    move-exception v0

    .line 268
    goto :goto_2

    .line 269
    :goto_3
    invoke-virtual {v1}, LO3/T1;->b()LO3/X;

    .line 270
    .line 271
    .line 272
    move-result-object v0

    .line 273
    iget-object v0, v0, LO3/X;->w:LO3/V;

    .line 274
    .line 275
    invoke-static {p2}, LO3/X;->w(Ljava/lang/String;)LO3/W;

    .line 276
    .line 277
    .line 278
    move-result-object p2

    .line 279
    invoke-virtual {v0, p2, p1, v5}, LO3/V;->d(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 280
    .line 281
    .line 282
    sget-object p1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 283
    .line 284
    goto :goto_6

    .line 285
    :cond_4
    invoke-virtual {v1}, LO3/T1;->c()LO3/p0;

    .line 286
    .line 287
    .line 288
    move-result-object v2

    .line 289
    new-instance v3, LO3/z0;

    .line 290
    .line 291
    invoke-direct {v3, p0, p1, v0, v4}, LO3/z0;-><init>(LO3/C0;LO3/a2;Landroid/os/Bundle;I)V

    .line 292
    .line 293
    .line 294
    invoke-virtual {v2, v3}, LO3/p0;->v(Ljava/util/concurrent/Callable;)LO3/n0;

    .line 295
    .line 296
    .line 297
    move-result-object p1

    .line 298
    :try_start_1
    invoke-virtual {p1}, Ljava/util/concurrent/FutureTask;->get()Ljava/lang/Object;

    .line 299
    .line 300
    .line 301
    move-result-object p1

    .line 302
    check-cast p1, Ljava/util/List;
    :try_end_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_4
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_1 .. :try_end_1} :catch_3

    .line 303
    .line 304
    goto :goto_6

    .line 305
    :catch_3
    move-exception v0

    .line 306
    :goto_4
    move-object p1, v0

    .line 307
    goto :goto_5

    .line 308
    :catch_4
    move-exception v0

    .line 309
    goto :goto_4

    .line 310
    :goto_5
    invoke-virtual {v1}, LO3/T1;->b()LO3/X;

    .line 311
    .line 312
    .line 313
    move-result-object v0

    .line 314
    iget-object v0, v0, LO3/X;->w:LO3/V;

    .line 315
    .line 316
    invoke-static {p2}, LO3/X;->w(Ljava/lang/String;)LO3/W;

    .line 317
    .line 318
    .line 319
    move-result-object p2

    .line 320
    invoke-virtual {v0, p2, p1, v5}, LO3/V;->d(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 321
    .line 322
    .line 323
    sget-object p1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 324
    .line 325
    :goto_6
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 326
    .line 327
    .line 328
    invoke-virtual {p3, p1}, Landroid/os/Parcel;->writeTypedList(Ljava/util/List;)V

    .line 329
    .line 330
    .line 331
    move-object v5, p0

    .line 332
    goto/16 :goto_d

    .line 333
    .line 334
    :pswitch_8
    sget-object p1, LO3/a2;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 335
    .line 336
    invoke-static {p2, p1}, Lcom/google/android/gms/internal/measurement/y;->a(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 337
    .line 338
    .line 339
    move-result-object p1

    .line 340
    check-cast p1, LO3/a2;

    .line 341
    .line 342
    invoke-static {p2}, Lcom/google/android/gms/internal/measurement/y;->d(Landroid/os/Parcel;)V

    .line 343
    .line 344
    .line 345
    invoke-virtual {p0, p1}, LO3/C0;->g(LO3/a2;)LO3/i;

    .line 346
    .line 347
    .line 348
    move-result-object p1

    .line 349
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 350
    .line 351
    .line 352
    if-nez p1, :cond_5

    .line 353
    .line 354
    invoke-virtual {p3, v3}, Landroid/os/Parcel;->writeInt(I)V

    .line 355
    .line 356
    .line 357
    return v4

    .line 358
    :cond_5
    invoke-virtual {p3, v4}, Landroid/os/Parcel;->writeInt(I)V

    .line 359
    .line 360
    .line 361
    invoke-virtual {p1, p3, v4}, LO3/i;->writeToParcel(Landroid/os/Parcel;I)V

    .line 362
    .line 363
    .line 364
    return v4

    .line 365
    :pswitch_9
    sget-object p1, LO3/a2;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 366
    .line 367
    invoke-static {p2, p1}, Lcom/google/android/gms/internal/measurement/y;->a(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 368
    .line 369
    .line 370
    move-result-object p1

    .line 371
    check-cast p1, LO3/a2;

    .line 372
    .line 373
    invoke-static {p2}, Lcom/google/android/gms/internal/measurement/y;->d(Landroid/os/Parcel;)V

    .line 374
    .line 375
    .line 376
    invoke-virtual {p0, p1}, LO3/C0;->F(LO3/a2;)V

    .line 377
    .line 378
    .line 379
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 380
    .line 381
    .line 382
    return v4

    .line 383
    :pswitch_a
    sget-object p1, Landroid/os/Bundle;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 384
    .line 385
    invoke-static {p2, p1}, Lcom/google/android/gms/internal/measurement/y;->a(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 386
    .line 387
    .line 388
    move-result-object p1

    .line 389
    check-cast p1, Landroid/os/Bundle;

    .line 390
    .line 391
    sget-object v0, LO3/a2;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 392
    .line 393
    invoke-static {p2, v0}, Lcom/google/android/gms/internal/measurement/y;->a(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 394
    .line 395
    .line 396
    move-result-object v0

    .line 397
    check-cast v0, LO3/a2;

    .line 398
    .line 399
    invoke-static {p2}, Lcom/google/android/gms/internal/measurement/y;->d(Landroid/os/Parcel;)V

    .line 400
    .line 401
    .line 402
    invoke-virtual {p0, v0, p1}, LO3/C0;->E(LO3/a2;Landroid/os/Bundle;)V

    .line 403
    .line 404
    .line 405
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 406
    .line 407
    .line 408
    return v4

    .line 409
    :pswitch_b
    sget-object p1, LO3/a2;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 410
    .line 411
    invoke-static {p2, p1}, Lcom/google/android/gms/internal/measurement/y;->a(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 412
    .line 413
    .line 414
    move-result-object p1

    .line 415
    check-cast p1, LO3/a2;

    .line 416
    .line 417
    invoke-static {p2}, Lcom/google/android/gms/internal/measurement/y;->d(Landroid/os/Parcel;)V

    .line 418
    .line 419
    .line 420
    invoke-virtual {p0, p1}, LO3/C0;->l(LO3/a2;)V

    .line 421
    .line 422
    .line 423
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 424
    .line 425
    .line 426
    return v4

    .line 427
    :pswitch_c
    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 428
    .line 429
    .line 430
    move-result-object p1

    .line 431
    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 432
    .line 433
    .line 434
    move-result-object v0

    .line 435
    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 436
    .line 437
    .line 438
    move-result-object v1

    .line 439
    invoke-static {p2}, Lcom/google/android/gms/internal/measurement/y;->d(Landroid/os/Parcel;)V

    .line 440
    .line 441
    .line 442
    invoke-virtual {p0, p1, v0, v1}, LO3/C0;->v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;

    .line 443
    .line 444
    .line 445
    move-result-object p1

    .line 446
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 447
    .line 448
    .line 449
    invoke-virtual {p3, p1}, Landroid/os/Parcel;->writeTypedList(Ljava/util/List;)V

    .line 450
    .line 451
    .line 452
    return v4

    .line 453
    :pswitch_d
    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 454
    .line 455
    .line 456
    move-result-object p1

    .line 457
    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 458
    .line 459
    .line 460
    move-result-object v0

    .line 461
    sget-object v1, LO3/a2;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 462
    .line 463
    invoke-static {p2, v1}, Lcom/google/android/gms/internal/measurement/y;->a(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 464
    .line 465
    .line 466
    move-result-object v1

    .line 467
    check-cast v1, LO3/a2;

    .line 468
    .line 469
    invoke-static {p2}, Lcom/google/android/gms/internal/measurement/y;->d(Landroid/os/Parcel;)V

    .line 470
    .line 471
    .line 472
    invoke-virtual {p0, p1, v0, v1}, LO3/C0;->z(Ljava/lang/String;Ljava/lang/String;LO3/a2;)Ljava/util/List;

    .line 473
    .line 474
    .line 475
    move-result-object p1

    .line 476
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 477
    .line 478
    .line 479
    invoke-virtual {p3, p1}, Landroid/os/Parcel;->writeTypedList(Ljava/util/List;)V

    .line 480
    .line 481
    .line 482
    return v4

    .line 483
    :pswitch_e
    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 484
    .line 485
    .line 486
    move-result-object p1

    .line 487
    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 488
    .line 489
    .line 490
    move-result-object v0

    .line 491
    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 492
    .line 493
    .line 494
    move-result-object v1

    .line 495
    sget-object v2, Lcom/google/android/gms/internal/measurement/y;->a:Ljava/lang/ClassLoader;

    .line 496
    .line 497
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    .line 498
    .line 499
    .line 500
    move-result v2

    .line 501
    if-eqz v2, :cond_6

    .line 502
    .line 503
    move v3, v4

    .line 504
    :cond_6
    invoke-static {p2}, Lcom/google/android/gms/internal/measurement/y;->d(Landroid/os/Parcel;)V

    .line 505
    .line 506
    .line 507
    invoke-virtual {p0, p1, v0, v1, v3}, LO3/C0;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/util/List;

    .line 508
    .line 509
    .line 510
    move-result-object p1

    .line 511
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 512
    .line 513
    .line 514
    invoke-virtual {p3, p1}, Landroid/os/Parcel;->writeTypedList(Ljava/util/List;)V

    .line 515
    .line 516
    .line 517
    return v4

    .line 518
    :pswitch_f
    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 519
    .line 520
    .line 521
    move-result-object p1

    .line 522
    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 523
    .line 524
    .line 525
    move-result-object v0

    .line 526
    sget-object v1, Lcom/google/android/gms/internal/measurement/y;->a:Ljava/lang/ClassLoader;

    .line 527
    .line 528
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    .line 529
    .line 530
    .line 531
    move-result v1

    .line 532
    if-eqz v1, :cond_7

    .line 533
    .line 534
    move v3, v4

    .line 535
    :cond_7
    sget-object v1, LO3/a2;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 536
    .line 537
    invoke-static {p2, v1}, Lcom/google/android/gms/internal/measurement/y;->a(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 538
    .line 539
    .line 540
    move-result-object v1

    .line 541
    check-cast v1, LO3/a2;

    .line 542
    .line 543
    invoke-static {p2}, Lcom/google/android/gms/internal/measurement/y;->d(Landroid/os/Parcel;)V

    .line 544
    .line 545
    .line 546
    invoke-virtual {p0, p1, v0, v3, v1}, LO3/C0;->t(Ljava/lang/String;Ljava/lang/String;ZLO3/a2;)Ljava/util/List;

    .line 547
    .line 548
    .line 549
    move-result-object p1

    .line 550
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 551
    .line 552
    .line 553
    invoke-virtual {p3, p1}, Landroid/os/Parcel;->writeTypedList(Ljava/util/List;)V

    .line 554
    .line 555
    .line 556
    return v4

    .line 557
    :pswitch_10
    sget-object p1, LO3/e;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 558
    .line 559
    invoke-static {p2, p1}, Lcom/google/android/gms/internal/measurement/y;->a(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 560
    .line 561
    .line 562
    move-result-object p1

    .line 563
    check-cast p1, LO3/e;

    .line 564
    .line 565
    invoke-static {p2}, Lcom/google/android/gms/internal/measurement/y;->d(Landroid/os/Parcel;)V

    .line 566
    .line 567
    .line 568
    invoke-static {p1}, Lx3/A;->g(Ljava/lang/Object;)V

    .line 569
    .line 570
    .line 571
    iget-object p2, p1, LO3/e;->s:LO3/V1;

    .line 572
    .line 573
    invoke-static {p2}, Lx3/A;->g(Ljava/lang/Object;)V

    .line 574
    .line 575
    .line 576
    iget-object p2, p1, LO3/e;->q:Ljava/lang/String;

    .line 577
    .line 578
    invoke-static {p2}, Lx3/A;->d(Ljava/lang/String;)V

    .line 579
    .line 580
    .line 581
    iget-object p2, p1, LO3/e;->q:Ljava/lang/String;

    .line 582
    .line 583
    invoke-virtual {p0, p2, v4}, LO3/C0;->L(Ljava/lang/String;Z)V

    .line 584
    .line 585
    .line 586
    new-instance p2, LO3/e;

    .line 587
    .line 588
    invoke-direct {p2, p1}, LO3/e;-><init>(LO3/e;)V

    .line 589
    .line 590
    .line 591
    new-instance p1, LI4/a;

    .line 592
    .line 593
    const/4 v0, 0x6

    .line 594
    invoke-direct {p1, v0, p0, p2, v3}, LI4/a;-><init>(ILjava/lang/Object;Ljava/lang/Object;Z)V

    .line 595
    .line 596
    .line 597
    invoke-virtual {p0, p1}, LO3/C0;->M(Ljava/lang/Runnable;)V

    .line 598
    .line 599
    .line 600
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 601
    .line 602
    .line 603
    return v4

    .line 604
    :pswitch_11
    sget-object p1, LO3/e;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 605
    .line 606
    invoke-static {p2, p1}, Lcom/google/android/gms/internal/measurement/y;->a(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 607
    .line 608
    .line 609
    move-result-object p1

    .line 610
    check-cast p1, LO3/e;

    .line 611
    .line 612
    sget-object v0, LO3/a2;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 613
    .line 614
    invoke-static {p2, v0}, Lcom/google/android/gms/internal/measurement/y;->a(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 615
    .line 616
    .line 617
    move-result-object v0

    .line 618
    check-cast v0, LO3/a2;

    .line 619
    .line 620
    invoke-static {p2}, Lcom/google/android/gms/internal/measurement/y;->d(Landroid/os/Parcel;)V

    .line 621
    .line 622
    .line 623
    invoke-virtual {p0, p1, v0}, LO3/C0;->k(LO3/e;LO3/a2;)V

    .line 624
    .line 625
    .line 626
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 627
    .line 628
    .line 629
    return v4

    .line 630
    :pswitch_12
    sget-object p1, LO3/a2;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 631
    .line 632
    invoke-static {p2, p1}, Lcom/google/android/gms/internal/measurement/y;->a(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 633
    .line 634
    .line 635
    move-result-object p1

    .line 636
    check-cast p1, LO3/a2;

    .line 637
    .line 638
    invoke-static {p2}, Lcom/google/android/gms/internal/measurement/y;->d(Landroid/os/Parcel;)V

    .line 639
    .line 640
    .line 641
    invoke-virtual {p0, p1}, LO3/C0;->x(LO3/a2;)Ljava/lang/String;

    .line 642
    .line 643
    .line 644
    move-result-object p1

    .line 645
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 646
    .line 647
    .line 648
    invoke-virtual {p3, p1}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 649
    .line 650
    .line 651
    return v4

    .line 652
    :pswitch_13
    invoke-virtual {p2}, Landroid/os/Parcel;->readLong()J

    .line 653
    .line 654
    .line 655
    move-result-wide v6

    .line 656
    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 657
    .line 658
    .line 659
    move-result-object v8

    .line 660
    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 661
    .line 662
    .line 663
    move-result-object v9

    .line 664
    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 665
    .line 666
    .line 667
    move-result-object v10

    .line 668
    invoke-static {p2}, Lcom/google/android/gms/internal/measurement/y;->d(Landroid/os/Parcel;)V

    .line 669
    .line 670
    .line 671
    move-object v5, p0

    .line 672
    invoke-virtual/range {v5 .. v10}, LO3/C0;->r(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 673
    .line 674
    .line 675
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 676
    .line 677
    .line 678
    return v4

    .line 679
    :pswitch_14
    move-object v5, p0

    .line 680
    sget-object p1, LO3/v;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 681
    .line 682
    invoke-static {p2, p1}, Lcom/google/android/gms/internal/measurement/y;->a(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 683
    .line 684
    .line 685
    move-result-object p1

    .line 686
    check-cast p1, LO3/v;

    .line 687
    .line 688
    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 689
    .line 690
    .line 691
    move-result-object v0

    .line 692
    invoke-static {p2}, Lcom/google/android/gms/internal/measurement/y;->d(Landroid/os/Parcel;)V

    .line 693
    .line 694
    .line 695
    invoke-virtual {p0, p1, v0}, LO3/C0;->m(LO3/v;Ljava/lang/String;)[B

    .line 696
    .line 697
    .line 698
    move-result-object p1

    .line 699
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 700
    .line 701
    .line 702
    invoke-virtual {p3, p1}, Landroid/os/Parcel;->writeByteArray([B)V

    .line 703
    .line 704
    .line 705
    return v4

    .line 706
    :pswitch_15
    move-object v5, p0

    .line 707
    sget-object p1, LO3/a2;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 708
    .line 709
    invoke-static {p2, p1}, Lcom/google/android/gms/internal/measurement/y;->a(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 710
    .line 711
    .line 712
    move-result-object p1

    .line 713
    check-cast p1, LO3/a2;

    .line 714
    .line 715
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    .line 716
    .line 717
    .line 718
    move-result v0

    .line 719
    if-eqz v0, :cond_8

    .line 720
    .line 721
    move v0, v4

    .line 722
    goto :goto_7

    .line 723
    :cond_8
    move v0, v3

    .line 724
    :goto_7
    invoke-static {p2}, Lcom/google/android/gms/internal/measurement/y;->d(Landroid/os/Parcel;)V

    .line 725
    .line 726
    .line 727
    invoke-virtual {p0, p1}, LO3/C0;->K(LO3/a2;)V

    .line 728
    .line 729
    .line 730
    iget-object p1, p1, LO3/a2;->q:Ljava/lang/String;

    .line 731
    .line 732
    invoke-static {p1}, Lx3/A;->g(Ljava/lang/Object;)V

    .line 733
    .line 734
    .line 735
    invoke-virtual {v1}, LO3/T1;->c()LO3/p0;

    .line 736
    .line 737
    .line 738
    move-result-object p2

    .line 739
    new-instance v6, LO3/u0;

    .line 740
    .line 741
    invoke-direct {v6, p0, p1, v3}, LO3/u0;-><init>(LO3/C0;Ljava/lang/Object;I)V

    .line 742
    .line 743
    .line 744
    invoke-virtual {p2, v6}, LO3/p0;->v(Ljava/util/concurrent/Callable;)LO3/n0;

    .line 745
    .line 746
    .line 747
    move-result-object p2

    .line 748
    :try_start_2
    invoke-virtual {p2}, Ljava/util/concurrent/FutureTask;->get()Ljava/lang/Object;

    .line 749
    .line 750
    .line 751
    move-result-object p2

    .line 752
    check-cast p2, Ljava/util/List;

    .line 753
    .line 754
    new-instance v3, Ljava/util/ArrayList;

    .line 755
    .line 756
    invoke-interface {p2}, Ljava/util/List;->size()I

    .line 757
    .line 758
    .line 759
    move-result v6

    .line 760
    invoke-direct {v3, v6}, Ljava/util/ArrayList;-><init>(I)V

    .line 761
    .line 762
    .line 763
    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 764
    .line 765
    .line 766
    move-result-object p2

    .line 767
    :cond_9
    :goto_8
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 768
    .line 769
    .line 770
    move-result v6

    .line 771
    if-eqz v6, :cond_b

    .line 772
    .line 773
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 774
    .line 775
    .line 776
    move-result-object v6

    .line 777
    check-cast v6, LO3/W1;

    .line 778
    .line 779
    if-nez v0, :cond_a

    .line 780
    .line 781
    iget-object v7, v6, LO3/W1;->c:Ljava/lang/String;

    .line 782
    .line 783
    invoke-static {v7}, LO3/Y1;->M(Ljava/lang/String;)Z

    .line 784
    .line 785
    .line 786
    move-result v7

    .line 787
    if-nez v7, :cond_9

    .line 788
    .line 789
    goto :goto_a

    .line 790
    :catch_5
    move-exception v0

    .line 791
    :goto_9
    move-object p2, v0

    .line 792
    goto :goto_b

    .line 793
    :catch_6
    move-exception v0

    .line 794
    goto :goto_9

    .line 795
    :cond_a
    :goto_a
    new-instance v7, LO3/V1;

    .line 796
    .line 797
    invoke-direct {v7, v6}, LO3/V1;-><init>(LO3/W1;)V

    .line 798
    .line 799
    .line 800
    invoke-virtual {v3, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_2
    .catch Ljava/lang/InterruptedException; {:try_start_2 .. :try_end_2} :catch_6
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_2 .. :try_end_2} :catch_5

    .line 801
    .line 802
    .line 803
    goto :goto_8

    .line 804
    :cond_b
    move-object v2, v3

    .line 805
    goto :goto_c

    .line 806
    :goto_b
    invoke-virtual {v1}, LO3/T1;->b()LO3/X;

    .line 807
    .line 808
    .line 809
    move-result-object v0

    .line 810
    iget-object v0, v0, LO3/X;->w:LO3/V;

    .line 811
    .line 812
    invoke-static {p1}, LO3/X;->w(Ljava/lang/String;)LO3/W;

    .line 813
    .line 814
    .line 815
    move-result-object p1

    .line 816
    const-string v1, "Failed to get user properties. appId"

    .line 817
    .line 818
    invoke-virtual {v0, p1, p2, v1}, LO3/V;->d(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 819
    .line 820
    .line 821
    :goto_c
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 822
    .line 823
    .line 824
    invoke-virtual {p3, v2}, Landroid/os/Parcel;->writeTypedList(Ljava/util/List;)V

    .line 825
    .line 826
    .line 827
    :goto_d
    return v4

    .line 828
    :pswitch_16
    move-object v5, p0

    .line 829
    sget-object p1, LO3/a2;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 830
    .line 831
    invoke-static {p2, p1}, Lcom/google/android/gms/internal/measurement/y;->a(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 832
    .line 833
    .line 834
    move-result-object p1

    .line 835
    check-cast p1, LO3/a2;

    .line 836
    .line 837
    invoke-static {p2}, Lcom/google/android/gms/internal/measurement/y;->d(Landroid/os/Parcel;)V

    .line 838
    .line 839
    .line 840
    invoke-virtual {p0, p1}, LO3/C0;->B(LO3/a2;)V

    .line 841
    .line 842
    .line 843
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 844
    .line 845
    .line 846
    return v4

    .line 847
    :pswitch_17
    move-object v5, p0

    .line 848
    sget-object p1, LO3/v;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 849
    .line 850
    invoke-static {p2, p1}, Lcom/google/android/gms/internal/measurement/y;->a(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 851
    .line 852
    .line 853
    move-result-object p1

    .line 854
    check-cast p1, LO3/v;

    .line 855
    .line 856
    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 857
    .line 858
    .line 859
    move-result-object v1

    .line 860
    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 861
    .line 862
    .line 863
    invoke-static {p2}, Lcom/google/android/gms/internal/measurement/y;->d(Landroid/os/Parcel;)V

    .line 864
    .line 865
    .line 866
    invoke-static {p1}, Lx3/A;->g(Ljava/lang/Object;)V

    .line 867
    .line 868
    .line 869
    invoke-static {v1}, Lx3/A;->d(Ljava/lang/String;)V

    .line 870
    .line 871
    .line 872
    invoke-virtual {p0, v1, v4}, LO3/C0;->L(Ljava/lang/String;Z)V

    .line 873
    .line 874
    .line 875
    new-instance p2, LO3/x0;

    .line 876
    .line 877
    invoke-direct {p2, p0, p1, v1, v0}, LO3/x0;-><init>(LO3/C0;Ly3/a;Ljava/lang/Object;I)V

    .line 878
    .line 879
    .line 880
    invoke-virtual {p0, p2}, LO3/C0;->M(Ljava/lang/Runnable;)V

    .line 881
    .line 882
    .line 883
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 884
    .line 885
    .line 886
    return v4

    .line 887
    :pswitch_18
    move-object v5, p0

    .line 888
    sget-object p1, LO3/a2;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 889
    .line 890
    invoke-static {p2, p1}, Lcom/google/android/gms/internal/measurement/y;->a(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 891
    .line 892
    .line 893
    move-result-object p1

    .line 894
    check-cast p1, LO3/a2;

    .line 895
    .line 896
    invoke-static {p2}, Lcom/google/android/gms/internal/measurement/y;->d(Landroid/os/Parcel;)V

    .line 897
    .line 898
    .line 899
    invoke-virtual {p0, p1}, LO3/C0;->n(LO3/a2;)V

    .line 900
    .line 901
    .line 902
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 903
    .line 904
    .line 905
    return v4

    .line 906
    :pswitch_19
    move-object v5, p0

    .line 907
    sget-object p1, LO3/V1;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 908
    .line 909
    invoke-static {p2, p1}, Lcom/google/android/gms/internal/measurement/y;->a(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 910
    .line 911
    .line 912
    move-result-object p1

    .line 913
    check-cast p1, LO3/V1;

    .line 914
    .line 915
    sget-object v0, LO3/a2;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 916
    .line 917
    invoke-static {p2, v0}, Lcom/google/android/gms/internal/measurement/y;->a(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 918
    .line 919
    .line 920
    move-result-object v0

    .line 921
    check-cast v0, LO3/a2;

    .line 922
    .line 923
    invoke-static {p2}, Lcom/google/android/gms/internal/measurement/y;->d(Landroid/os/Parcel;)V

    .line 924
    .line 925
    .line 926
    invoke-virtual {p0, p1, v0}, LO3/C0;->e(LO3/V1;LO3/a2;)V

    .line 927
    .line 928
    .line 929
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 930
    .line 931
    .line 932
    return v4

    .line 933
    :pswitch_1a
    move-object v5, p0

    .line 934
    sget-object p1, LO3/v;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 935
    .line 936
    invoke-static {p2, p1}, Lcom/google/android/gms/internal/measurement/y;->a(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 937
    .line 938
    .line 939
    move-result-object p1

    .line 940
    check-cast p1, LO3/v;

    .line 941
    .line 942
    sget-object v0, LO3/a2;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 943
    .line 944
    invoke-static {p2, v0}, Lcom/google/android/gms/internal/measurement/y;->a(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 945
    .line 946
    .line 947
    move-result-object v0

    .line 948
    check-cast v0, LO3/a2;

    .line 949
    .line 950
    invoke-static {p2}, Lcom/google/android/gms/internal/measurement/y;->d(Landroid/os/Parcel;)V

    .line 951
    .line 952
    .line 953
    invoke-virtual {p0, p1, v0}, LO3/C0;->H(LO3/v;LO3/a2;)V

    .line 954
    .line 955
    .line 956
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 957
    .line 958
    .line 959
    return v4

    .line 960
    nop

    .line 961
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1a
        :pswitch_19
        :pswitch_0
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_0
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_0
        :pswitch_0
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_0
        :pswitch_3
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method

.method public final J(Ljava/lang/Runnable;)V
    .locals 2

    .line 1
    iget-object v0, p0, LO3/C0;->c:LO3/T1;

    .line 2
    .line 3
    invoke-virtual {v0}, LO3/T1;->c()LO3/p0;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-virtual {v1}, LO3/p0;->u()Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    invoke-interface {p1}, Ljava/lang/Runnable;->run()V

    .line 14
    .line 15
    .line 16
    return-void

    .line 17
    :cond_0
    invoke-virtual {v0}, LO3/T1;->c()LO3/p0;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-virtual {v0, p1}, LO3/p0;->z(Ljava/lang/Runnable;)V

    .line 22
    .line 23
    .line 24
    return-void
.end method

.method public final K(LO3/a2;)V
    .locals 2

    .line 1
    invoke-static {p1}, Lx3/A;->g(Ljava/lang/Object;)V

    .line 2
    .line 3
    .line 4
    iget-object v0, p1, LO3/a2;->q:Ljava/lang/String;

    .line 5
    .line 6
    invoke-static {v0}, Lx3/A;->d(Ljava/lang/String;)V

    .line 7
    .line 8
    .line 9
    const/4 v1, 0x0

    .line 10
    invoke-virtual {p0, v0, v1}, LO3/C0;->L(Ljava/lang/String;Z)V

    .line 11
    .line 12
    .line 13
    iget-object v0, p0, LO3/C0;->c:LO3/T1;

    .line 14
    .line 15
    invoke-virtual {v0}, LO3/T1;->j0()LO3/Y1;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    iget-object p1, p1, LO3/a2;->r:Ljava/lang/String;

    .line 20
    .line 21
    invoke-virtual {v0, p1}, LO3/Y1;->s(Ljava/lang/String;)Z

    .line 22
    .line 23
    .line 24
    return-void
.end method

.method public final L(Ljava/lang/String;Z)V
    .locals 4

    .line 1
    const-string v0, "Unknown calling package name \'"

    .line 2
    .line 3
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    iget-object v2, p0, LO3/C0;->c:LO3/T1;

    .line 8
    .line 9
    if-nez v1, :cond_7

    .line 10
    .line 11
    if-eqz p2, :cond_3

    .line 12
    .line 13
    :try_start_0
    iget-object p2, p0, LO3/C0;->d:Ljava/lang/Boolean;

    .line 14
    .line 15
    if-nez p2, :cond_2

    .line 16
    .line 17
    const-string p2, "com.google.android.gms"

    .line 18
    .line 19
    iget-object v1, p0, LO3/C0;->e:Ljava/lang/String;

    .line 20
    .line 21
    invoke-virtual {p2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    move-result p2

    .line 25
    const/4 v1, 0x1

    .line 26
    if-nez p2, :cond_1

    .line 27
    .line 28
    iget-object p2, v2, LO3/T1;->B:LO3/t0;

    .line 29
    .line 30
    iget-object p2, p2, LO3/t0;->q:Landroid/content/Context;

    .line 31
    .line 32
    invoke-static {}, Landroid/os/Binder;->getCallingUid()I

    .line 33
    .line 34
    .line 35
    move-result v3

    .line 36
    invoke-static {p2, v3}, LB3/b;->c(Landroid/content/Context;I)Z

    .line 37
    .line 38
    .line 39
    move-result p2

    .line 40
    if-nez p2, :cond_1

    .line 41
    .line 42
    iget-object p2, v2, LO3/T1;->B:LO3/t0;

    .line 43
    .line 44
    iget-object p2, p2, LO3/t0;->q:Landroid/content/Context;

    .line 45
    .line 46
    invoke-static {p2}, Lcom/google/android/gms/common/i;->a(Landroid/content/Context;)Lcom/google/android/gms/common/i;

    .line 47
    .line 48
    .line 49
    move-result-object p2

    .line 50
    invoke-static {}, Landroid/os/Binder;->getCallingUid()I

    .line 51
    .line 52
    .line 53
    move-result v3

    .line 54
    invoke-virtual {p2, v3}, Lcom/google/android/gms/common/i;->b(I)Z

    .line 55
    .line 56
    .line 57
    move-result p2

    .line 58
    if-eqz p2, :cond_0

    .line 59
    .line 60
    goto :goto_0

    .line 61
    :cond_0
    const/4 v1, 0x0

    .line 62
    goto :goto_0

    .line 63
    :catch_0
    move-exception p2

    .line 64
    goto :goto_1

    .line 65
    :cond_1
    :goto_0
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 66
    .line 67
    .line 68
    move-result-object p2

    .line 69
    iput-object p2, p0, LO3/C0;->d:Ljava/lang/Boolean;

    .line 70
    .line 71
    :cond_2
    iget-object p2, p0, LO3/C0;->d:Ljava/lang/Boolean;

    .line 72
    .line 73
    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 74
    .line 75
    .line 76
    move-result p2

    .line 77
    if-nez p2, :cond_5

    .line 78
    .line 79
    :cond_3
    iget-object p2, p0, LO3/C0;->e:Ljava/lang/String;

    .line 80
    .line 81
    if-nez p2, :cond_4

    .line 82
    .line 83
    iget-object p2, v2, LO3/T1;->B:LO3/t0;

    .line 84
    .line 85
    iget-object p2, p2, LO3/t0;->q:Landroid/content/Context;

    .line 86
    .line 87
    invoke-static {}, Landroid/os/Binder;->getCallingUid()I

    .line 88
    .line 89
    .line 90
    move-result v1

    .line 91
    invoke-static {p2, v1, p1}, Lcom/google/android/gms/common/h;->uidHasPackageName(Landroid/content/Context;ILjava/lang/String;)Z

    .line 92
    .line 93
    .line 94
    move-result p2

    .line 95
    if-eqz p2, :cond_4

    .line 96
    .line 97
    iput-object p1, p0, LO3/C0;->e:Ljava/lang/String;

    .line 98
    .line 99
    :cond_4
    iget-object p2, p0, LO3/C0;->e:Ljava/lang/String;

    .line 100
    .line 101
    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 102
    .line 103
    .line 104
    move-result p2

    .line 105
    if-eqz p2, :cond_6

    .line 106
    .line 107
    :cond_5
    return-void

    .line 108
    :cond_6
    new-instance p2, Ljava/lang/SecurityException;

    .line 109
    .line 110
    new-instance v1, Ljava/lang/StringBuilder;

    .line 111
    .line 112
    invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 113
    .line 114
    .line 115
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 116
    .line 117
    .line 118
    const-string v0, "\'."

    .line 119
    .line 120
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 121
    .line 122
    .line 123
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 124
    .line 125
    .line 126
    move-result-object v0

    .line 127
    invoke-direct {p2, v0}, Ljava/lang/SecurityException;-><init>(Ljava/lang/String;)V

    .line 128
    .line 129
    .line 130
    throw p2
    :try_end_0
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_0

    .line 131
    :goto_1
    invoke-virtual {v2}, LO3/T1;->b()LO3/X;

    .line 132
    .line 133
    .line 134
    move-result-object v0

    .line 135
    iget-object v0, v0, LO3/X;->w:LO3/V;

    .line 136
    .line 137
    invoke-static {p1}, LO3/X;->w(Ljava/lang/String;)LO3/W;

    .line 138
    .line 139
    .line 140
    move-result-object p1

    .line 141
    const-string v1, "Measurement Service called with invalid calling package. appId"

    .line 142
    .line 143
    invoke-virtual {v0, p1, v1}, LO3/V;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 144
    .line 145
    .line 146
    throw p2

    .line 147
    :cond_7
    invoke-virtual {v2}, LO3/T1;->b()LO3/X;

    .line 148
    .line 149
    .line 150
    move-result-object p1

    .line 151
    iget-object p1, p1, LO3/X;->w:LO3/V;

    .line 152
    .line 153
    const-string p2, "Measurement Service called without app package"

    .line 154
    .line 155
    invoke-virtual {p1, p2}, LO3/V;->b(Ljava/lang/String;)V

    .line 156
    .line 157
    .line 158
    new-instance p1, Ljava/lang/SecurityException;

    .line 159
    .line 160
    invoke-direct {p1, p2}, Ljava/lang/SecurityException;-><init>(Ljava/lang/String;)V

    .line 161
    .line 162
    .line 163
    throw p1
.end method

.method public final M(Ljava/lang/Runnable;)V
    .locals 2

    .line 1
    iget-object v0, p0, LO3/C0;->c:LO3/T1;

    .line 2
    .line 3
    invoke-virtual {v0}, LO3/T1;->c()LO3/p0;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-virtual {v1}, LO3/p0;->u()Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    invoke-interface {p1}, Ljava/lang/Runnable;->run()V

    .line 14
    .line 15
    .line 16
    return-void

    .line 17
    :cond_0
    invoke-virtual {v0}, LO3/T1;->c()LO3/p0;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-virtual {v0, p1}, LO3/p0;->x(Ljava/lang/Runnable;)V

    .line 22
    .line 23
    .line 24
    return-void
.end method

.method public final e(LO3/V1;LO3/a2;)V
    .locals 2

    .line 1
    invoke-static {p1}, Lx3/A;->g(Ljava/lang/Object;)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0, p2}, LO3/C0;->K(LO3/a2;)V

    .line 5
    .line 6
    .line 7
    new-instance v0, LO3/x0;

    .line 8
    .line 9
    const/4 v1, 0x3

    .line 10
    invoke-direct {v0, p0, p1, p2, v1}, LO3/x0;-><init>(LO3/C0;Ly3/a;Ljava/lang/Object;I)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0, v0}, LO3/C0;->M(Ljava/lang/Runnable;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public final g(LO3/a2;)LO3/i;
    .locals 5

    .line 1
    invoke-virtual {p0, p1}, LO3/C0;->K(LO3/a2;)V

    .line 2
    .line 3
    .line 4
    iget-object v0, p1, LO3/a2;->q:Ljava/lang/String;

    .line 5
    .line 6
    invoke-static {v0}, Lx3/A;->d(Ljava/lang/String;)V

    .line 7
    .line 8
    .line 9
    iget-object v1, p0, LO3/C0;->c:LO3/T1;

    .line 10
    .line 11
    invoke-virtual {v1}, LO3/T1;->c()LO3/p0;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    new-instance v3, LO3/u0;

    .line 16
    .line 17
    const/4 v4, 0x1

    .line 18
    invoke-direct {v3, p0, p1, v4}, LO3/u0;-><init>(LO3/C0;Ljava/lang/Object;I)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {v2, v3}, LO3/p0;->w(Ljava/util/concurrent/Callable;)LO3/n0;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    :try_start_0
    sget-object v2, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 26
    .line 27
    const-wide/16 v3, 0x2710

    .line 28
    .line 29
    invoke-virtual {p1, v3, v4, v2}, Ljava/util/concurrent/FutureTask;->get(JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    check-cast p1, LO3/i;
    :try_end_0
    .catch Ljava/util/concurrent/TimeoutException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_0 .. :try_end_0} :catch_0

    .line 34
    .line 35
    return-object p1

    .line 36
    :catch_0
    move-exception p1

    .line 37
    goto :goto_0

    .line 38
    :catch_1
    move-exception p1

    .line 39
    goto :goto_0

    .line 40
    :catch_2
    move-exception p1

    .line 41
    :goto_0
    invoke-virtual {v1}, LO3/T1;->b()LO3/X;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    iget-object v1, v1, LO3/X;->w:LO3/V;

    .line 46
    .line 47
    invoke-static {v0}, LO3/X;->w(Ljava/lang/String;)LO3/W;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    const-string v2, "Failed to get consent. appId"

    .line 52
    .line 53
    invoke-virtual {v1, v0, p1, v2}, LO3/V;->d(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    new-instance p1, LO3/i;

    .line 57
    .line 58
    const/4 v0, 0x0

    .line 59
    invoke-direct {p1, v0}, LO3/i;-><init>(Landroid/os/Bundle;)V

    .line 60
    .line 61
    .line 62
    return-object p1
.end method

.method public final i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/util/List;
    .locals 8

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-virtual {p0, p1, v0}, LO3/C0;->L(Ljava/lang/String;Z)V

    .line 3
    .line 4
    .line 5
    iget-object v1, p0, LO3/C0;->c:LO3/T1;

    .line 6
    .line 7
    invoke-virtual {v1}, LO3/T1;->c()LO3/p0;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    new-instance v2, LO3/y0;

    .line 12
    .line 13
    const/4 v7, 0x1

    .line 14
    move-object v3, p0

    .line 15
    move-object v4, p1

    .line 16
    move-object v5, p2

    .line 17
    move-object v6, p3

    .line 18
    invoke-direct/range {v2 .. v7}, LO3/y0;-><init>(LO3/C0;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0, v2}, LO3/p0;->v(Ljava/util/concurrent/Callable;)LO3/n0;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    :try_start_0
    invoke-virtual {p1}, Ljava/util/concurrent/FutureTask;->get()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    check-cast p1, Ljava/util/List;

    .line 30
    .line 31
    new-instance p2, Ljava/util/ArrayList;

    .line 32
    .line 33
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 34
    .line 35
    .line 36
    move-result p3

    .line 37
    invoke-direct {p2, p3}, Ljava/util/ArrayList;-><init>(I)V

    .line 38
    .line 39
    .line 40
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 45
    .line 46
    .line 47
    move-result p3

    .line 48
    if-eqz p3, :cond_2

    .line 49
    .line 50
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object p3

    .line 54
    check-cast p3, LO3/W1;

    .line 55
    .line 56
    if-nez p4, :cond_1

    .line 57
    .line 58
    iget-object v0, p3, LO3/W1;->c:Ljava/lang/String;

    .line 59
    .line 60
    invoke-static {v0}, LO3/Y1;->M(Ljava/lang/String;)Z

    .line 61
    .line 62
    .line 63
    move-result v0

    .line 64
    if-nez v0, :cond_0

    .line 65
    .line 66
    goto :goto_2

    .line 67
    :catch_0
    move-exception v0

    .line 68
    :goto_1
    move-object p1, v0

    .line 69
    goto :goto_3

    .line 70
    :catch_1
    move-exception v0

    .line 71
    goto :goto_1

    .line 72
    :cond_1
    :goto_2
    new-instance v0, LO3/V1;

    .line 73
    .line 74
    invoke-direct {v0, p3}, LO3/V1;-><init>(LO3/W1;)V

    .line 75
    .line 76
    .line 77
    invoke-virtual {p2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_0 .. :try_end_0} :catch_0

    .line 78
    .line 79
    .line 80
    goto :goto_0

    .line 81
    :cond_2
    return-object p2

    .line 82
    :goto_3
    invoke-virtual {v1}, LO3/T1;->b()LO3/X;

    .line 83
    .line 84
    .line 85
    move-result-object p2

    .line 86
    iget-object p2, p2, LO3/X;->w:LO3/V;

    .line 87
    .line 88
    invoke-static {v4}, LO3/X;->w(Ljava/lang/String;)LO3/W;

    .line 89
    .line 90
    .line 91
    move-result-object p3

    .line 92
    const-string p4, "Failed to get user properties as. appId"

    .line 93
    .line 94
    invoke-virtual {p2, p3, p1, p4}, LO3/V;->d(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 95
    .line 96
    .line 97
    sget-object p1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 98
    .line 99
    return-object p1
.end method

.method public final k(LO3/e;LO3/a2;)V
    .locals 2

    .line 1
    invoke-static {p1}, Lx3/A;->g(Ljava/lang/Object;)V

    .line 2
    .line 3
    .line 4
    iget-object v0, p1, LO3/e;->s:LO3/V1;

    .line 5
    .line 6
    invoke-static {v0}, Lx3/A;->g(Ljava/lang/Object;)V

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0, p2}, LO3/C0;->K(LO3/a2;)V

    .line 10
    .line 11
    .line 12
    new-instance v0, LO3/e;

    .line 13
    .line 14
    invoke-direct {v0, p1}, LO3/e;-><init>(LO3/e;)V

    .line 15
    .line 16
    .line 17
    iget-object p1, p2, LO3/a2;->q:Ljava/lang/String;

    .line 18
    .line 19
    iput-object p1, v0, LO3/e;->q:Ljava/lang/String;

    .line 20
    .line 21
    new-instance p1, LO3/x0;

    .line 22
    .line 23
    const/4 v1, 0x0

    .line 24
    invoke-direct {p1, p0, v0, p2, v1}, LO3/x0;-><init>(LO3/C0;Ly3/a;Ljava/lang/Object;I)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {p0, p1}, LO3/C0;->M(Ljava/lang/Runnable;)V

    .line 28
    .line 29
    .line 30
    return-void
.end method

.method public final l(LO3/a2;)V
    .locals 2

    .line 1
    iget-object v0, p1, LO3/a2;->q:Ljava/lang/String;

    .line 2
    .line 3
    invoke-static {v0}, Lx3/A;->d(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    invoke-virtual {p0, v0, v1}, LO3/C0;->L(Ljava/lang/String;Z)V

    .line 8
    .line 9
    .line 10
    new-instance v0, LO3/v0;

    .line 11
    .line 12
    const/4 v1, 0x3

    .line 13
    invoke-direct {v0, p0, p1, v1}, LO3/v0;-><init>(LO3/C0;LO3/a2;I)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0, v0}, LO3/C0;->M(Ljava/lang/Runnable;)V

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method public final m(LO3/v;Ljava/lang/String;)[B
    .locals 11

    .line 1
    invoke-static {p2}, Lx3/A;->d(Ljava/lang/String;)V

    .line 2
    .line 3
    .line 4
    invoke-static {p1}, Lx3/A;->g(Ljava/lang/Object;)V

    .line 5
    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    invoke-virtual {p0, p2, v0}, LO3/C0;->L(Ljava/lang/String;Z)V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, LO3/C0;->c:LO3/T1;

    .line 12
    .line 13
    invoke-virtual {v0}, LO3/T1;->b()LO3/X;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    iget-object v1, v1, LO3/X;->D:LO3/V;

    .line 18
    .line 19
    iget-object v2, v0, LO3/T1;->B:LO3/t0;

    .line 20
    .line 21
    iget-object v3, v2, LO3/t0;->z:LO3/Q;

    .line 22
    .line 23
    iget-object v4, p1, LO3/v;->q:Ljava/lang/String;

    .line 24
    .line 25
    invoke-virtual {v3, v4}, LO3/Q;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v3

    .line 29
    const-string v5, "Log and bundle. event"

    .line 30
    .line 31
    invoke-virtual {v1, v3, v5}, LO3/V;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {v0}, LO3/T1;->e()LB3/a;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 39
    .line 40
    .line 41
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    .line 42
    .line 43
    .line 44
    move-result-wide v5

    .line 45
    const-wide/32 v7, 0xf4240

    .line 46
    .line 47
    .line 48
    div-long/2addr v5, v7

    .line 49
    invoke-virtual {v0}, LO3/T1;->c()LO3/p0;

    .line 50
    .line 51
    .line 52
    move-result-object v1

    .line 53
    new-instance v3, LG3/b;

    .line 54
    .line 55
    invoke-direct {v3, p0, p1, p2}, LG3/b;-><init>(LO3/C0;LO3/v;Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    invoke-virtual {v1, v3}, LO3/p0;->w(Ljava/util/concurrent/Callable;)LO3/n0;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    :try_start_0
    invoke-virtual {p1}, Ljava/util/concurrent/FutureTask;->get()Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object p1

    .line 66
    check-cast p1, [B

    .line 67
    .line 68
    if-nez p1, :cond_0

    .line 69
    .line 70
    invoke-virtual {v0}, LO3/T1;->b()LO3/X;

    .line 71
    .line 72
    .line 73
    move-result-object p1

    .line 74
    iget-object p1, p1, LO3/X;->w:LO3/V;

    .line 75
    .line 76
    const-string v1, "Log and bundle returned null. appId"

    .line 77
    .line 78
    invoke-static {p2}, LO3/X;->w(Ljava/lang/String;)LO3/W;

    .line 79
    .line 80
    .line 81
    move-result-object v3

    .line 82
    invoke-virtual {p1, v3, v1}, LO3/V;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 83
    .line 84
    .line 85
    const/4 p1, 0x0

    .line 86
    new-array p1, p1, [B

    .line 87
    .line 88
    goto :goto_0

    .line 89
    :catch_0
    move-exception p1

    .line 90
    goto :goto_1

    .line 91
    :catch_1
    move-exception p1

    .line 92
    goto :goto_1

    .line 93
    :cond_0
    :goto_0
    invoke-virtual {v0}, LO3/T1;->e()LB3/a;

    .line 94
    .line 95
    .line 96
    move-result-object v1

    .line 97
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 98
    .line 99
    .line 100
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    .line 101
    .line 102
    .line 103
    move-result-wide v9

    .line 104
    div-long/2addr v9, v7

    .line 105
    invoke-virtual {v0}, LO3/T1;->b()LO3/X;

    .line 106
    .line 107
    .line 108
    move-result-object v1

    .line 109
    iget-object v1, v1, LO3/X;->D:LO3/V;

    .line 110
    .line 111
    const-string v3, "Log and bundle processed. event, size, time_ms"

    .line 112
    .line 113
    iget-object v7, v2, LO3/t0;->z:LO3/Q;

    .line 114
    .line 115
    invoke-virtual {v7, v4}, LO3/Q;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 116
    .line 117
    .line 118
    move-result-object v7

    .line 119
    array-length v8, p1

    .line 120
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 121
    .line 122
    .line 123
    move-result-object v8

    .line 124
    sub-long/2addr v9, v5

    .line 125
    invoke-static {v9, v10}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 126
    .line 127
    .line 128
    move-result-object v5

    .line 129
    invoke-virtual {v1, v3, v7, v8, v5}, LO3/V;->e(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_0 .. :try_end_0} :catch_0

    .line 130
    .line 131
    .line 132
    return-object p1

    .line 133
    :goto_1
    invoke-virtual {v0}, LO3/T1;->b()LO3/X;

    .line 134
    .line 135
    .line 136
    move-result-object v0

    .line 137
    iget-object v0, v0, LO3/X;->w:LO3/V;

    .line 138
    .line 139
    invoke-static {p2}, LO3/X;->w(Ljava/lang/String;)LO3/W;

    .line 140
    .line 141
    .line 142
    move-result-object p2

    .line 143
    iget-object v1, v2, LO3/t0;->z:LO3/Q;

    .line 144
    .line 145
    invoke-virtual {v1, v4}, LO3/Q;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 146
    .line 147
    .line 148
    move-result-object v1

    .line 149
    const-string v2, "Failed to log and bundle. appId, event, error"

    .line 150
    .line 151
    invoke-virtual {v0, v2, p2, v1, p1}, LO3/V;->e(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 152
    .line 153
    .line 154
    const/4 p1, 0x0

    .line 155
    return-object p1
.end method

.method public final n(LO3/a2;)V
    .locals 2

    .line 1
    invoke-virtual {p0, p1}, LO3/C0;->K(LO3/a2;)V

    .line 2
    .line 3
    .line 4
    new-instance v0, LO3/v0;

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    invoke-direct {v0, p0, p1, v1}, LO3/v0;-><init>(LO3/C0;LO3/a2;I)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0, v0}, LO3/C0;->M(Ljava/lang/Runnable;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public final p(LO3/a2;LO3/d;)V
    .locals 2

    .line 1
    invoke-virtual {p0, p1}, LO3/C0;->K(LO3/a2;)V

    .line 2
    .line 3
    .line 4
    new-instance v0, LO3/x0;

    .line 5
    .line 6
    const/4 v1, 0x4

    .line 7
    invoke-direct {v0, p0, p1, p2, v1}, LO3/x0;-><init>(Ljava/lang/Object;LO3/a2;Ljava/lang/Object;I)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0, v0}, LO3/C0;->M(Ljava/lang/Runnable;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public final q(LO3/a2;)V
    .locals 2

    .line 1
    invoke-virtual {p0, p1}, LO3/C0;->K(LO3/a2;)V

    .line 2
    .line 3
    .line 4
    new-instance v0, LO3/v0;

    .line 5
    .line 6
    const/4 v1, 0x1

    .line 7
    invoke-direct {v0, p0, p1, v1}, LO3/v0;-><init>(LO3/C0;LO3/a2;I)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0, v0}, LO3/C0;->M(Ljava/lang/Runnable;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public final r(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 8

    .line 1
    new-instance v0, LO3/w0;

    .line 2
    .line 3
    const/4 v7, 0x0

    .line 4
    move-object v1, p0

    .line 5
    move-wide v5, p1

    .line 6
    move-object v4, p3

    .line 7
    move-object v2, p4

    .line 8
    move-object v3, p5

    .line 9
    invoke-direct/range {v0 .. v7}, LO3/w0;-><init>(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;JI)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0, v0}, LO3/C0;->M(Ljava/lang/Runnable;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public final s(LO3/a2;)V
    .locals 2

    .line 1
    iget-object v0, p1, LO3/a2;->q:Ljava/lang/String;

    .line 2
    .line 3
    invoke-static {v0}, Lx3/A;->d(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p1, LO3/a2;->I:Ljava/lang/String;

    .line 7
    .line 8
    invoke-static {v0}, Lx3/A;->g(Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    new-instance v0, LO3/v0;

    .line 12
    .line 13
    const/4 v1, 0x6

    .line 14
    invoke-direct {v0, p0, p1, v1}, LO3/v0;-><init>(LO3/C0;LO3/a2;I)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0, v0}, LO3/C0;->J(Ljava/lang/Runnable;)V

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method public final t(Ljava/lang/String;Ljava/lang/String;ZLO3/a2;)Ljava/util/List;
    .locals 7

    .line 1
    invoke-virtual {p0, p4}, LO3/C0;->K(LO3/a2;)V

    .line 2
    .line 3
    .line 4
    iget-object v2, p4, LO3/a2;->q:Ljava/lang/String;

    .line 5
    .line 6
    invoke-static {v2}, Lx3/A;->g(Ljava/lang/Object;)V

    .line 7
    .line 8
    .line 9
    iget-object p4, p0, LO3/C0;->c:LO3/T1;

    .line 10
    .line 11
    invoke-virtual {p4}, LO3/T1;->c()LO3/p0;

    .line 12
    .line 13
    .line 14
    move-result-object v6

    .line 15
    new-instance v0, LO3/y0;

    .line 16
    .line 17
    const/4 v5, 0x0

    .line 18
    move-object v1, p0

    .line 19
    move-object v3, p1

    .line 20
    move-object v4, p2

    .line 21
    invoke-direct/range {v0 .. v5}, LO3/y0;-><init>(LO3/C0;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {v6, v0}, LO3/p0;->v(Ljava/util/concurrent/Callable;)LO3/n0;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    :try_start_0
    invoke-virtual {p1}, Ljava/util/concurrent/FutureTask;->get()Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    check-cast p1, Ljava/util/List;

    .line 33
    .line 34
    new-instance p2, Ljava/util/ArrayList;

    .line 35
    .line 36
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    invoke-direct {p2, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 41
    .line 42
    .line 43
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 48
    .line 49
    .line 50
    move-result v0

    .line 51
    if-eqz v0, :cond_2

    .line 52
    .line 53
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    check-cast v0, LO3/W1;

    .line 58
    .line 59
    if-nez p3, :cond_1

    .line 60
    .line 61
    iget-object v1, v0, LO3/W1;->c:Ljava/lang/String;

    .line 62
    .line 63
    invoke-static {v1}, LO3/Y1;->M(Ljava/lang/String;)Z

    .line 64
    .line 65
    .line 66
    move-result v1

    .line 67
    if-nez v1, :cond_0

    .line 68
    .line 69
    goto :goto_2

    .line 70
    :catch_0
    move-exception v0

    .line 71
    :goto_1
    move-object p1, v0

    .line 72
    goto :goto_3

    .line 73
    :catch_1
    move-exception v0

    .line 74
    goto :goto_1

    .line 75
    :cond_1
    :goto_2
    new-instance v1, LO3/V1;

    .line 76
    .line 77
    invoke-direct {v1, v0}, LO3/V1;-><init>(LO3/W1;)V

    .line 78
    .line 79
    .line 80
    invoke-virtual {p2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_0 .. :try_end_0} :catch_0

    .line 81
    .line 82
    .line 83
    goto :goto_0

    .line 84
    :cond_2
    return-object p2

    .line 85
    :goto_3
    invoke-virtual {p4}, LO3/T1;->b()LO3/X;

    .line 86
    .line 87
    .line 88
    move-result-object p2

    .line 89
    iget-object p2, p2, LO3/X;->w:LO3/V;

    .line 90
    .line 91
    invoke-static {v2}, LO3/X;->w(Ljava/lang/String;)LO3/W;

    .line 92
    .line 93
    .line 94
    move-result-object p3

    .line 95
    const-string p4, "Failed to query user properties. appId"

    .line 96
    .line 97
    invoke-virtual {p2, p3, p1, p4}, LO3/V;->d(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 98
    .line 99
    .line 100
    sget-object p1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 101
    .line 102
    return-object p1
.end method

.method public final v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;
    .locals 8

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-virtual {p0, p1, v0}, LO3/C0;->L(Ljava/lang/String;Z)V

    .line 3
    .line 4
    .line 5
    iget-object v1, p0, LO3/C0;->c:LO3/T1;

    .line 6
    .line 7
    invoke-virtual {v1}, LO3/T1;->c()LO3/p0;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    new-instance v2, LO3/y0;

    .line 12
    .line 13
    const/4 v7, 0x3

    .line 14
    move-object v3, p0

    .line 15
    move-object v4, p1

    .line 16
    move-object v5, p2

    .line 17
    move-object v6, p3

    .line 18
    invoke-direct/range {v2 .. v7}, LO3/y0;-><init>(LO3/C0;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0, v2}, LO3/p0;->v(Ljava/util/concurrent/Callable;)LO3/n0;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    :try_start_0
    invoke-virtual {p1}, Ljava/util/concurrent/FutureTask;->get()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    check-cast p1, Ljava/util/List;
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_0 .. :try_end_0} :catch_0

    .line 30
    .line 31
    return-object p1

    .line 32
    :catch_0
    move-exception v0

    .line 33
    :goto_0
    move-object p1, v0

    .line 34
    goto :goto_1

    .line 35
    :catch_1
    move-exception v0

    .line 36
    goto :goto_0

    .line 37
    :goto_1
    invoke-virtual {v1}, LO3/T1;->b()LO3/X;

    .line 38
    .line 39
    .line 40
    move-result-object p2

    .line 41
    iget-object p2, p2, LO3/X;->w:LO3/V;

    .line 42
    .line 43
    const-string p3, "Failed to get conditional user properties as"

    .line 44
    .line 45
    invoke-virtual {p2, p1, p3}, LO3/V;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    sget-object p1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 49
    .line 50
    return-object p1
.end method

.method public final x(LO3/a2;)Ljava/lang/String;
    .locals 5

    .line 1
    invoke-virtual {p0, p1}, LO3/C0;->K(LO3/a2;)V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, LO3/C0;->c:LO3/T1;

    .line 5
    .line 6
    invoke-virtual {v0}, LO3/T1;->c()LO3/p0;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    new-instance v2, LO3/u0;

    .line 11
    .line 12
    invoke-direct {v2, v0, p1}, LO3/u0;-><init>(LO3/T1;LO3/a2;)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {v1, v2}, LO3/p0;->v(Ljava/util/concurrent/Callable;)LO3/n0;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    :try_start_0
    sget-object v2, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 20
    .line 21
    const-wide/16 v3, 0x7530

    .line 22
    .line 23
    invoke-virtual {v1, v3, v4, v2}, Ljava/util/concurrent/FutureTask;->get(JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    check-cast v1, Ljava/lang/String;
    :try_end_0
    .catch Ljava/util/concurrent/TimeoutException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_0 .. :try_end_0} :catch_0

    .line 28
    .line 29
    return-object v1

    .line 30
    :catch_0
    move-exception v1

    .line 31
    goto :goto_0

    .line 32
    :catch_1
    move-exception v1

    .line 33
    goto :goto_0

    .line 34
    :catch_2
    move-exception v1

    .line 35
    :goto_0
    invoke-virtual {v0}, LO3/T1;->b()LO3/X;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    iget-object v0, v0, LO3/X;->w:LO3/V;

    .line 40
    .line 41
    iget-object p1, p1, LO3/a2;->q:Ljava/lang/String;

    .line 42
    .line 43
    invoke-static {p1}, LO3/X;->w(Ljava/lang/String;)LO3/W;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    const-string v2, "Failed to get app instance id. appId"

    .line 48
    .line 49
    invoke-virtual {v0, p1, v1, v2}, LO3/V;->d(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    const/4 p1, 0x0

    .line 53
    return-object p1
.end method

.method public final y(LO3/a2;Landroid/os/Bundle;LO3/K;)V
    .locals 7

    .line 1
    invoke-virtual {p0, p1}, LO3/C0;->K(LO3/a2;)V

    .line 2
    .line 3
    .line 4
    iget-object v5, p1, LO3/a2;->q:Ljava/lang/String;

    .line 5
    .line 6
    invoke-static {v5}, Lx3/A;->g(Ljava/lang/Object;)V

    .line 7
    .line 8
    .line 9
    iget-object v0, p0, LO3/C0;->c:LO3/T1;

    .line 10
    .line 11
    invoke-virtual {v0}, LO3/T1;->c()LO3/p0;

    .line 12
    .line 13
    .line 14
    move-result-object v6

    .line 15
    new-instance v0, LO3/A0;

    .line 16
    .line 17
    move-object v1, p0

    .line 18
    move-object v2, p1

    .line 19
    move-object v3, p2

    .line 20
    move-object v4, p3

    .line 21
    invoke-direct/range {v0 .. v5}, LO3/A0;-><init>(LO3/C0;LO3/a2;Landroid/os/Bundle;LO3/K;Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {v6, v0}, LO3/p0;->x(Ljava/lang/Runnable;)V

    .line 25
    .line 26
    .line 27
    return-void
.end method

.method public final z(Ljava/lang/String;Ljava/lang/String;LO3/a2;)Ljava/util/List;
    .locals 7

    .line 1
    invoke-virtual {p0, p3}, LO3/C0;->K(LO3/a2;)V

    .line 2
    .line 3
    .line 4
    iget-object v2, p3, LO3/a2;->q:Ljava/lang/String;

    .line 5
    .line 6
    invoke-static {v2}, Lx3/A;->g(Ljava/lang/Object;)V

    .line 7
    .line 8
    .line 9
    iget-object p3, p0, LO3/C0;->c:LO3/T1;

    .line 10
    .line 11
    invoke-virtual {p3}, LO3/T1;->c()LO3/p0;

    .line 12
    .line 13
    .line 14
    move-result-object v6

    .line 15
    new-instance v0, LO3/y0;

    .line 16
    .line 17
    const/4 v5, 0x2

    .line 18
    move-object v1, p0

    .line 19
    move-object v3, p1

    .line 20
    move-object v4, p2

    .line 21
    invoke-direct/range {v0 .. v5}, LO3/y0;-><init>(LO3/C0;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {v6, v0}, LO3/p0;->v(Ljava/util/concurrent/Callable;)LO3/n0;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    :try_start_0
    invoke-virtual {p1}, Ljava/util/concurrent/FutureTask;->get()Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    check-cast p1, Ljava/util/List;
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_0 .. :try_end_0} :catch_0

    .line 33
    .line 34
    return-object p1

    .line 35
    :catch_0
    move-exception v0

    .line 36
    :goto_0
    move-object p1, v0

    .line 37
    goto :goto_1

    .line 38
    :catch_1
    move-exception v0

    .line 39
    goto :goto_0

    .line 40
    :goto_1
    invoke-virtual {p3}, LO3/T1;->b()LO3/X;

    .line 41
    .line 42
    .line 43
    move-result-object p2

    .line 44
    iget-object p2, p2, LO3/X;->w:LO3/V;

    .line 45
    .line 46
    const-string p3, "Failed to get conditional user properties"

    .line 47
    .line 48
    invoke-virtual {p2, p1, p3}, LO3/V;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    sget-object p1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 52
    .line 53
    return-object p1
.end method
