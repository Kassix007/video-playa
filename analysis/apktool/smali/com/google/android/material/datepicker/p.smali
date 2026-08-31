.class public final Lcom/google/android/material/datepicker/p;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# instance fields
.field public final synthetic a:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/google/android/material/datepicker/p;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Lx3/g;Landroid/os/Parcel;I)V
    .locals 4

    .line 1
    const/16 v0, 0x4f45

    .line 2
    .line 3
    invoke-static {p1, v0}, Lcom/google/android/gms/internal/measurement/n2;->Y(Landroid/os/Parcel;I)I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    iget v1, p0, Lx3/g;->q:I

    .line 8
    .line 9
    const/4 v2, 0x1

    .line 10
    const/4 v3, 0x4

    .line 11
    invoke-static {p1, v2, v3}, Lcom/google/android/gms/internal/measurement/n2;->b0(Landroid/os/Parcel;II)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    .line 15
    .line 16
    .line 17
    iget v1, p0, Lx3/g;->r:I

    .line 18
    .line 19
    const/4 v2, 0x2

    .line 20
    invoke-static {p1, v2, v3}, Lcom/google/android/gms/internal/measurement/n2;->b0(Landroid/os/Parcel;II)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    .line 24
    .line 25
    .line 26
    iget v1, p0, Lx3/g;->s:I

    .line 27
    .line 28
    const/4 v2, 0x3

    .line 29
    invoke-static {p1, v2, v3}, Lcom/google/android/gms/internal/measurement/n2;->b0(Landroid/os/Parcel;II)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    .line 33
    .line 34
    .line 35
    iget-object v1, p0, Lx3/g;->t:Ljava/lang/String;

    .line 36
    .line 37
    invoke-static {p1, v3, v1}, Lcom/google/android/gms/internal/measurement/n2;->V(Landroid/os/Parcel;ILjava/lang/String;)V

    .line 38
    .line 39
    .line 40
    const/4 v1, 0x5

    .line 41
    iget-object v2, p0, Lx3/g;->u:Landroid/os/IBinder;

    .line 42
    .line 43
    invoke-static {p1, v1, v2}, Lcom/google/android/gms/internal/measurement/n2;->S(Landroid/os/Parcel;ILandroid/os/IBinder;)V

    .line 44
    .line 45
    .line 46
    const/4 v1, 0x6

    .line 47
    iget-object v2, p0, Lx3/g;->v:[Lcom/google/android/gms/common/api/Scope;

    .line 48
    .line 49
    invoke-static {p1, v1, v2, p2}, Lcom/google/android/gms/internal/measurement/n2;->W(Landroid/os/Parcel;I[Landroid/os/Parcelable;I)V

    .line 50
    .line 51
    .line 52
    const/4 v1, 0x7

    .line 53
    iget-object v2, p0, Lx3/g;->w:Landroid/os/Bundle;

    .line 54
    .line 55
    invoke-static {p1, v1, v2}, Lcom/google/android/gms/internal/measurement/n2;->P(Landroid/os/Parcel;ILandroid/os/Bundle;)V

    .line 56
    .line 57
    .line 58
    const/16 v1, 0x8

    .line 59
    .line 60
    iget-object v2, p0, Lx3/g;->x:Landroid/accounts/Account;

    .line 61
    .line 62
    invoke-static {p1, v1, v2, p2}, Lcom/google/android/gms/internal/measurement/n2;->U(Landroid/os/Parcel;ILandroid/os/Parcelable;I)V

    .line 63
    .line 64
    .line 65
    const/16 v1, 0xa

    .line 66
    .line 67
    iget-object v2, p0, Lx3/g;->y:[Lcom/google/android/gms/common/d;

    .line 68
    .line 69
    invoke-static {p1, v1, v2, p2}, Lcom/google/android/gms/internal/measurement/n2;->W(Landroid/os/Parcel;I[Landroid/os/Parcelable;I)V

    .line 70
    .line 71
    .line 72
    const/16 v1, 0xb

    .line 73
    .line 74
    iget-object v2, p0, Lx3/g;->z:[Lcom/google/android/gms/common/d;

    .line 75
    .line 76
    invoke-static {p1, v1, v2, p2}, Lcom/google/android/gms/internal/measurement/n2;->W(Landroid/os/Parcel;I[Landroid/os/Parcelable;I)V

    .line 77
    .line 78
    .line 79
    iget-boolean p2, p0, Lx3/g;->A:Z

    .line 80
    .line 81
    const/16 v1, 0xc

    .line 82
    .line 83
    invoke-static {p1, v1, v3}, Lcom/google/android/gms/internal/measurement/n2;->b0(Landroid/os/Parcel;II)V

    .line 84
    .line 85
    .line 86
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 87
    .line 88
    .line 89
    iget p2, p0, Lx3/g;->B:I

    .line 90
    .line 91
    const/16 v1, 0xd

    .line 92
    .line 93
    invoke-static {p1, v1, v3}, Lcom/google/android/gms/internal/measurement/n2;->b0(Landroid/os/Parcel;II)V

    .line 94
    .line 95
    .line 96
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 97
    .line 98
    .line 99
    iget-boolean p2, p0, Lx3/g;->C:Z

    .line 100
    .line 101
    const/16 v1, 0xe

    .line 102
    .line 103
    invoke-static {p1, v1, v3}, Lcom/google/android/gms/internal/measurement/n2;->b0(Landroid/os/Parcel;II)V

    .line 104
    .line 105
    .line 106
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 107
    .line 108
    .line 109
    const/16 p2, 0xf

    .line 110
    .line 111
    iget-object p0, p0, Lx3/g;->D:Ljava/lang/String;

    .line 112
    .line 113
    invoke-static {p1, p2, p0}, Lcom/google/android/gms/internal/measurement/n2;->V(Landroid/os/Parcel;ILjava/lang/String;)V

    .line 114
    .line 115
    .line 116
    invoke-static {p1, v0}, Lcom/google/android/gms/internal/measurement/n2;->a0(Landroid/os/Parcel;I)V

    .line 117
    .line 118
    .line 119
    return-void
.end method


# virtual methods
.method public final createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 23

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget v2, v0, Lcom/google/android/material/datepicker/p;->a:I

    .line 6
    .line 7
    packed-switch v2, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    invoke-static {v1}, Lcom/google/android/gms/internal/measurement/P1;->f0(Landroid/os/Parcel;)I

    .line 11
    .line 12
    .line 13
    move-result v2

    .line 14
    new-instance v3, Landroid/os/Bundle;

    .line 15
    .line 16
    invoke-direct {v3}, Landroid/os/Bundle;-><init>()V

    .line 17
    .line 18
    .line 19
    sget-object v4, Lx3/g;->E:[Lcom/google/android/gms/common/api/Scope;

    .line 20
    .line 21
    const/4 v5, 0x0

    .line 22
    const/4 v6, 0x0

    .line 23
    sget-object v7, Lx3/g;->F:[Lcom/google/android/gms/common/d;

    .line 24
    .line 25
    move-object v15, v3

    .line 26
    move-object v14, v4

    .line 27
    move-object v12, v5

    .line 28
    move-object v13, v12

    .line 29
    move-object/from16 v16, v13

    .line 30
    .line 31
    move-object/from16 v22, v16

    .line 32
    .line 33
    move v9, v6

    .line 34
    move v10, v9

    .line 35
    move v11, v10

    .line 36
    move/from16 v19, v11

    .line 37
    .line 38
    move/from16 v20, v19

    .line 39
    .line 40
    move/from16 v21, v20

    .line 41
    .line 42
    move-object/from16 v17, v7

    .line 43
    .line 44
    move-object/from16 v18, v17

    .line 45
    .line 46
    :goto_0
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 47
    .line 48
    .line 49
    move-result v3

    .line 50
    if-ge v3, v2, :cond_0

    .line 51
    .line 52
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 53
    .line 54
    .line 55
    move-result v3

    .line 56
    int-to-char v4, v3

    .line 57
    packed-switch v4, :pswitch_data_1

    .line 58
    .line 59
    .line 60
    :pswitch_0
    invoke-static {v1, v3}, Lcom/google/android/gms/internal/measurement/P1;->c0(Landroid/os/Parcel;I)V

    .line 61
    .line 62
    .line 63
    goto :goto_0

    .line 64
    :pswitch_1
    invoke-static {v1, v3}, Lcom/google/android/gms/internal/measurement/P1;->u(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object v22

    .line 68
    goto :goto_0

    .line 69
    :pswitch_2
    invoke-static {v1, v3}, Lcom/google/android/gms/internal/measurement/P1;->K(Landroid/os/Parcel;I)Z

    .line 70
    .line 71
    .line 72
    move-result v21

    .line 73
    goto :goto_0

    .line 74
    :pswitch_3
    invoke-static {v1, v3}, Lcom/google/android/gms/internal/measurement/P1;->M(Landroid/os/Parcel;I)I

    .line 75
    .line 76
    .line 77
    move-result v20

    .line 78
    goto :goto_0

    .line 79
    :pswitch_4
    invoke-static {v1, v3}, Lcom/google/android/gms/internal/measurement/P1;->K(Landroid/os/Parcel;I)Z

    .line 80
    .line 81
    .line 82
    move-result v19

    .line 83
    goto :goto_0

    .line 84
    :pswitch_5
    sget-object v4, Lcom/google/android/gms/common/d;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 85
    .line 86
    invoke-static {v1, v3, v4}, Lcom/google/android/gms/internal/measurement/P1;->v(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)[Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object v3

    .line 90
    move-object/from16 v18, v3

    .line 91
    .line 92
    check-cast v18, [Lcom/google/android/gms/common/d;

    .line 93
    .line 94
    goto :goto_0

    .line 95
    :pswitch_6
    sget-object v4, Lcom/google/android/gms/common/d;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 96
    .line 97
    invoke-static {v1, v3, v4}, Lcom/google/android/gms/internal/measurement/P1;->v(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)[Ljava/lang/Object;

    .line 98
    .line 99
    .line 100
    move-result-object v3

    .line 101
    move-object/from16 v17, v3

    .line 102
    .line 103
    check-cast v17, [Lcom/google/android/gms/common/d;

    .line 104
    .line 105
    goto :goto_0

    .line 106
    :pswitch_7
    sget-object v4, Landroid/accounts/Account;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 107
    .line 108
    invoke-static {v1, v3, v4}, Lcom/google/android/gms/internal/measurement/P1;->t(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 109
    .line 110
    .line 111
    move-result-object v3

    .line 112
    move-object/from16 v16, v3

    .line 113
    .line 114
    check-cast v16, Landroid/accounts/Account;

    .line 115
    .line 116
    goto :goto_0

    .line 117
    :pswitch_8
    invoke-static {v1, v3}, Lcom/google/android/gms/internal/measurement/P1;->o(Landroid/os/Parcel;I)Landroid/os/Bundle;

    .line 118
    .line 119
    .line 120
    move-result-object v15

    .line 121
    goto :goto_0

    .line 122
    :pswitch_9
    sget-object v4, Lcom/google/android/gms/common/api/Scope;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 123
    .line 124
    invoke-static {v1, v3, v4}, Lcom/google/android/gms/internal/measurement/P1;->v(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)[Ljava/lang/Object;

    .line 125
    .line 126
    .line 127
    move-result-object v3

    .line 128
    move-object v14, v3

    .line 129
    check-cast v14, [Lcom/google/android/gms/common/api/Scope;

    .line 130
    .line 131
    goto :goto_0

    .line 132
    :pswitch_a
    invoke-static {v1, v3}, Lcom/google/android/gms/internal/measurement/P1;->L(Landroid/os/Parcel;I)Landroid/os/IBinder;

    .line 133
    .line 134
    .line 135
    move-result-object v13

    .line 136
    goto :goto_0

    .line 137
    :pswitch_b
    invoke-static {v1, v3}, Lcom/google/android/gms/internal/measurement/P1;->u(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 138
    .line 139
    .line 140
    move-result-object v12

    .line 141
    goto :goto_0

    .line 142
    :pswitch_c
    invoke-static {v1, v3}, Lcom/google/android/gms/internal/measurement/P1;->M(Landroid/os/Parcel;I)I

    .line 143
    .line 144
    .line 145
    move-result v11

    .line 146
    goto :goto_0

    .line 147
    :pswitch_d
    invoke-static {v1, v3}, Lcom/google/android/gms/internal/measurement/P1;->M(Landroid/os/Parcel;I)I

    .line 148
    .line 149
    .line 150
    move-result v10

    .line 151
    goto :goto_0

    .line 152
    :pswitch_e
    invoke-static {v1, v3}, Lcom/google/android/gms/internal/measurement/P1;->M(Landroid/os/Parcel;I)I

    .line 153
    .line 154
    .line 155
    move-result v9

    .line 156
    goto :goto_0

    .line 157
    :cond_0
    invoke-static {v1, v2}, Lcom/google/android/gms/internal/measurement/P1;->y(Landroid/os/Parcel;I)V

    .line 158
    .line 159
    .line 160
    new-instance v8, Lx3/g;

    .line 161
    .line 162
    invoke-direct/range {v8 .. v22}, Lx3/g;-><init>(IIILjava/lang/String;Landroid/os/IBinder;[Lcom/google/android/gms/common/api/Scope;Landroid/os/Bundle;Landroid/accounts/Account;[Lcom/google/android/gms/common/d;[Lcom/google/android/gms/common/d;ZIZLjava/lang/String;)V

    .line 163
    .line 164
    .line 165
    return-object v8

    .line 166
    :pswitch_f
    invoke-static {v1}, Lcom/google/android/gms/internal/measurement/P1;->f0(Landroid/os/Parcel;)I

    .line 167
    .line 168
    .line 169
    move-result v2

    .line 170
    const/4 v3, 0x0

    .line 171
    const/4 v4, 0x0

    .line 172
    move-object v6, v3

    .line 173
    move-object v9, v6

    .line 174
    move-object v11, v9

    .line 175
    move v7, v4

    .line 176
    move v8, v7

    .line 177
    move v10, v8

    .line 178
    :goto_1
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 179
    .line 180
    .line 181
    move-result v3

    .line 182
    if-ge v3, v2, :cond_1

    .line 183
    .line 184
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 185
    .line 186
    .line 187
    move-result v3

    .line 188
    int-to-char v4, v3

    .line 189
    packed-switch v4, :pswitch_data_2

    .line 190
    .line 191
    .line 192
    invoke-static {v1, v3}, Lcom/google/android/gms/internal/measurement/P1;->c0(Landroid/os/Parcel;I)V

    .line 193
    .line 194
    .line 195
    goto :goto_1

    .line 196
    :pswitch_10
    invoke-static {v1, v3}, Lcom/google/android/gms/internal/measurement/P1;->s(Landroid/os/Parcel;I)[I

    .line 197
    .line 198
    .line 199
    move-result-object v11

    .line 200
    goto :goto_1

    .line 201
    :pswitch_11
    invoke-static {v1, v3}, Lcom/google/android/gms/internal/measurement/P1;->M(Landroid/os/Parcel;I)I

    .line 202
    .line 203
    .line 204
    move-result v10

    .line 205
    goto :goto_1

    .line 206
    :pswitch_12
    invoke-static {v1, v3}, Lcom/google/android/gms/internal/measurement/P1;->s(Landroid/os/Parcel;I)[I

    .line 207
    .line 208
    .line 209
    move-result-object v9

    .line 210
    goto :goto_1

    .line 211
    :pswitch_13
    invoke-static {v1, v3}, Lcom/google/android/gms/internal/measurement/P1;->K(Landroid/os/Parcel;I)Z

    .line 212
    .line 213
    .line 214
    move-result v8

    .line 215
    goto :goto_1

    .line 216
    :pswitch_14
    invoke-static {v1, v3}, Lcom/google/android/gms/internal/measurement/P1;->K(Landroid/os/Parcel;I)Z

    .line 217
    .line 218
    .line 219
    move-result v7

    .line 220
    goto :goto_1

    .line 221
    :pswitch_15
    sget-object v4, Lx3/l;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 222
    .line 223
    invoke-static {v1, v3, v4}, Lcom/google/android/gms/internal/measurement/P1;->t(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 224
    .line 225
    .line 226
    move-result-object v3

    .line 227
    move-object v6, v3

    .line 228
    check-cast v6, Lx3/l;

    .line 229
    .line 230
    goto :goto_1

    .line 231
    :cond_1
    invoke-static {v1, v2}, Lcom/google/android/gms/internal/measurement/P1;->y(Landroid/os/Parcel;I)V

    .line 232
    .line 233
    .line 234
    new-instance v5, Lx3/f;

    .line 235
    .line 236
    invoke-direct/range {v5 .. v11}, Lx3/f;-><init>(Lx3/l;ZZ[II[I)V

    .line 237
    .line 238
    .line 239
    return-object v5

    .line 240
    :pswitch_16
    invoke-static {v1}, Lcom/google/android/gms/internal/measurement/P1;->f0(Landroid/os/Parcel;)I

    .line 241
    .line 242
    .line 243
    move-result v2

    .line 244
    const/4 v3, 0x0

    .line 245
    const/4 v4, 0x0

    .line 246
    move-object v5, v3

    .line 247
    move v6, v4

    .line 248
    move-object v4, v5

    .line 249
    :goto_2
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 250
    .line 251
    .line 252
    move-result v7

    .line 253
    if-ge v7, v2, :cond_6

    .line 254
    .line 255
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 256
    .line 257
    .line 258
    move-result v7

    .line 259
    int-to-char v8, v7

    .line 260
    const/4 v9, 0x1

    .line 261
    if-eq v8, v9, :cond_5

    .line 262
    .line 263
    const/4 v9, 0x2

    .line 264
    if-eq v8, v9, :cond_4

    .line 265
    .line 266
    const/4 v9, 0x3

    .line 267
    if-eq v8, v9, :cond_3

    .line 268
    .line 269
    const/4 v9, 0x4

    .line 270
    if-eq v8, v9, :cond_2

    .line 271
    .line 272
    invoke-static {v1, v7}, Lcom/google/android/gms/internal/measurement/P1;->c0(Landroid/os/Parcel;I)V

    .line 273
    .line 274
    .line 275
    goto :goto_2

    .line 276
    :cond_2
    sget-object v5, Lx3/f;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 277
    .line 278
    invoke-static {v1, v7, v5}, Lcom/google/android/gms/internal/measurement/P1;->t(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 279
    .line 280
    .line 281
    move-result-object v5

    .line 282
    check-cast v5, Lx3/f;

    .line 283
    .line 284
    goto :goto_2

    .line 285
    :cond_3
    invoke-static {v1, v7}, Lcom/google/android/gms/internal/measurement/P1;->M(Landroid/os/Parcel;I)I

    .line 286
    .line 287
    .line 288
    move-result v6

    .line 289
    goto :goto_2

    .line 290
    :cond_4
    sget-object v4, Lcom/google/android/gms/common/d;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 291
    .line 292
    invoke-static {v1, v7, v4}, Lcom/google/android/gms/internal/measurement/P1;->v(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)[Ljava/lang/Object;

    .line 293
    .line 294
    .line 295
    move-result-object v4

    .line 296
    check-cast v4, [Lcom/google/android/gms/common/d;

    .line 297
    .line 298
    goto :goto_2

    .line 299
    :cond_5
    invoke-static {v1, v7}, Lcom/google/android/gms/internal/measurement/P1;->o(Landroid/os/Parcel;I)Landroid/os/Bundle;

    .line 300
    .line 301
    .line 302
    move-result-object v3

    .line 303
    goto :goto_2

    .line 304
    :cond_6
    invoke-static {v1, v2}, Lcom/google/android/gms/internal/measurement/P1;->y(Landroid/os/Parcel;I)V

    .line 305
    .line 306
    .line 307
    new-instance v1, Lx3/H;

    .line 308
    .line 309
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 310
    .line 311
    .line 312
    iput-object v3, v1, Lx3/H;->q:Landroid/os/Bundle;

    .line 313
    .line 314
    iput-object v4, v1, Lx3/H;->r:[Lcom/google/android/gms/common/d;

    .line 315
    .line 316
    iput v6, v1, Lx3/H;->s:I

    .line 317
    .line 318
    iput-object v5, v1, Lx3/H;->t:Lx3/f;

    .line 319
    .line 320
    return-object v1

    .line 321
    :pswitch_17
    invoke-static {v1}, Lcom/google/android/gms/internal/measurement/P1;->f0(Landroid/os/Parcel;)I

    .line 322
    .line 323
    .line 324
    move-result v2

    .line 325
    const/4 v3, 0x0

    .line 326
    move v5, v3

    .line 327
    move v6, v5

    .line 328
    move v7, v6

    .line 329
    move v8, v7

    .line 330
    move v9, v8

    .line 331
    :goto_3
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 332
    .line 333
    .line 334
    move-result v3

    .line 335
    if-ge v3, v2, :cond_c

    .line 336
    .line 337
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 338
    .line 339
    .line 340
    move-result v3

    .line 341
    int-to-char v4, v3

    .line 342
    const/4 v10, 0x1

    .line 343
    if-eq v4, v10, :cond_b

    .line 344
    .line 345
    const/4 v10, 0x2

    .line 346
    if-eq v4, v10, :cond_a

    .line 347
    .line 348
    const/4 v10, 0x3

    .line 349
    if-eq v4, v10, :cond_9

    .line 350
    .line 351
    const/4 v10, 0x4

    .line 352
    if-eq v4, v10, :cond_8

    .line 353
    .line 354
    const/4 v10, 0x5

    .line 355
    if-eq v4, v10, :cond_7

    .line 356
    .line 357
    invoke-static {v1, v3}, Lcom/google/android/gms/internal/measurement/P1;->c0(Landroid/os/Parcel;I)V

    .line 358
    .line 359
    .line 360
    goto :goto_3

    .line 361
    :cond_7
    invoke-static {v1, v3}, Lcom/google/android/gms/internal/measurement/P1;->M(Landroid/os/Parcel;I)I

    .line 362
    .line 363
    .line 364
    move-result v7

    .line 365
    goto :goto_3

    .line 366
    :cond_8
    invoke-static {v1, v3}, Lcom/google/android/gms/internal/measurement/P1;->M(Landroid/os/Parcel;I)I

    .line 367
    .line 368
    .line 369
    move-result v6

    .line 370
    goto :goto_3

    .line 371
    :cond_9
    invoke-static {v1, v3}, Lcom/google/android/gms/internal/measurement/P1;->K(Landroid/os/Parcel;I)Z

    .line 372
    .line 373
    .line 374
    move-result v9

    .line 375
    goto :goto_3

    .line 376
    :cond_a
    invoke-static {v1, v3}, Lcom/google/android/gms/internal/measurement/P1;->K(Landroid/os/Parcel;I)Z

    .line 377
    .line 378
    .line 379
    move-result v8

    .line 380
    goto :goto_3

    .line 381
    :cond_b
    invoke-static {v1, v3}, Lcom/google/android/gms/internal/measurement/P1;->M(Landroid/os/Parcel;I)I

    .line 382
    .line 383
    .line 384
    move-result v5

    .line 385
    goto :goto_3

    .line 386
    :cond_c
    invoke-static {v1, v2}, Lcom/google/android/gms/internal/measurement/P1;->y(Landroid/os/Parcel;I)V

    .line 387
    .line 388
    .line 389
    new-instance v4, Lx3/l;

    .line 390
    .line 391
    invoke-direct/range {v4 .. v9}, Lx3/l;-><init>(IIIZZ)V

    .line 392
    .line 393
    .line 394
    return-object v4

    .line 395
    :pswitch_18
    invoke-static {v1}, Lcom/google/android/gms/internal/measurement/P1;->f0(Landroid/os/Parcel;)I

    .line 396
    .line 397
    .line 398
    move-result v2

    .line 399
    const/4 v3, 0x0

    .line 400
    const/4 v4, 0x0

    .line 401
    move v6, v3

    .line 402
    move v9, v6

    .line 403
    move v10, v9

    .line 404
    move-object v7, v4

    .line 405
    move-object v8, v7

    .line 406
    :goto_4
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 407
    .line 408
    .line 409
    move-result v3

    .line 410
    if-ge v3, v2, :cond_12

    .line 411
    .line 412
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 413
    .line 414
    .line 415
    move-result v3

    .line 416
    int-to-char v4, v3

    .line 417
    const/4 v5, 0x1

    .line 418
    if-eq v4, v5, :cond_11

    .line 419
    .line 420
    const/4 v5, 0x2

    .line 421
    if-eq v4, v5, :cond_10

    .line 422
    .line 423
    const/4 v5, 0x3

    .line 424
    if-eq v4, v5, :cond_f

    .line 425
    .line 426
    const/4 v5, 0x4

    .line 427
    if-eq v4, v5, :cond_e

    .line 428
    .line 429
    const/4 v5, 0x5

    .line 430
    if-eq v4, v5, :cond_d

    .line 431
    .line 432
    invoke-static {v1, v3}, Lcom/google/android/gms/internal/measurement/P1;->c0(Landroid/os/Parcel;I)V

    .line 433
    .line 434
    .line 435
    goto :goto_4

    .line 436
    :cond_d
    invoke-static {v1, v3}, Lcom/google/android/gms/internal/measurement/P1;->K(Landroid/os/Parcel;I)Z

    .line 437
    .line 438
    .line 439
    move-result v10

    .line 440
    goto :goto_4

    .line 441
    :cond_e
    invoke-static {v1, v3}, Lcom/google/android/gms/internal/measurement/P1;->K(Landroid/os/Parcel;I)Z

    .line 442
    .line 443
    .line 444
    move-result v9

    .line 445
    goto :goto_4

    .line 446
    :cond_f
    sget-object v4, Lcom/google/android/gms/common/b;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 447
    .line 448
    invoke-static {v1, v3, v4}, Lcom/google/android/gms/internal/measurement/P1;->t(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 449
    .line 450
    .line 451
    move-result-object v3

    .line 452
    move-object v8, v3

    .line 453
    check-cast v8, Lcom/google/android/gms/common/b;

    .line 454
    .line 455
    goto :goto_4

    .line 456
    :cond_10
    invoke-static {v1, v3}, Lcom/google/android/gms/internal/measurement/P1;->L(Landroid/os/Parcel;I)Landroid/os/IBinder;

    .line 457
    .line 458
    .line 459
    move-result-object v7

    .line 460
    goto :goto_4

    .line 461
    :cond_11
    invoke-static {v1, v3}, Lcom/google/android/gms/internal/measurement/P1;->M(Landroid/os/Parcel;I)I

    .line 462
    .line 463
    .line 464
    move-result v6

    .line 465
    goto :goto_4

    .line 466
    :cond_12
    invoke-static {v1, v2}, Lcom/google/android/gms/internal/measurement/P1;->y(Landroid/os/Parcel;I)V

    .line 467
    .line 468
    .line 469
    new-instance v5, Lx3/t;

    .line 470
    .line 471
    invoke-direct/range {v5 .. v10}, Lx3/t;-><init>(ILandroid/os/IBinder;Lcom/google/android/gms/common/b;ZZ)V

    .line 472
    .line 473
    .line 474
    return-object v5

    .line 475
    :pswitch_19
    invoke-static {v1}, Lcom/google/android/gms/internal/measurement/P1;->f0(Landroid/os/Parcel;)I

    .line 476
    .line 477
    .line 478
    move-result v2

    .line 479
    const/4 v3, 0x0

    .line 480
    const/4 v4, 0x0

    .line 481
    move v5, v4

    .line 482
    move v6, v5

    .line 483
    move-object v4, v3

    .line 484
    :goto_5
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 485
    .line 486
    .line 487
    move-result v7

    .line 488
    if-ge v7, v2, :cond_17

    .line 489
    .line 490
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 491
    .line 492
    .line 493
    move-result v7

    .line 494
    int-to-char v8, v7

    .line 495
    const/4 v9, 0x1

    .line 496
    if-eq v8, v9, :cond_16

    .line 497
    .line 498
    const/4 v9, 0x2

    .line 499
    if-eq v8, v9, :cond_15

    .line 500
    .line 501
    const/4 v9, 0x3

    .line 502
    if-eq v8, v9, :cond_14

    .line 503
    .line 504
    const/4 v9, 0x4

    .line 505
    if-eq v8, v9, :cond_13

    .line 506
    .line 507
    invoke-static {v1, v7}, Lcom/google/android/gms/internal/measurement/P1;->c0(Landroid/os/Parcel;I)V

    .line 508
    .line 509
    .line 510
    goto :goto_5

    .line 511
    :cond_13
    sget-object v4, Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 512
    .line 513
    invoke-static {v1, v7, v4}, Lcom/google/android/gms/internal/measurement/P1;->t(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 514
    .line 515
    .line 516
    move-result-object v4

    .line 517
    check-cast v4, Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;

    .line 518
    .line 519
    goto :goto_5

    .line 520
    :cond_14
    invoke-static {v1, v7}, Lcom/google/android/gms/internal/measurement/P1;->M(Landroid/os/Parcel;I)I

    .line 521
    .line 522
    .line 523
    move-result v6

    .line 524
    goto :goto_5

    .line 525
    :cond_15
    sget-object v3, Landroid/accounts/Account;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 526
    .line 527
    invoke-static {v1, v7, v3}, Lcom/google/android/gms/internal/measurement/P1;->t(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 528
    .line 529
    .line 530
    move-result-object v3

    .line 531
    check-cast v3, Landroid/accounts/Account;

    .line 532
    .line 533
    goto :goto_5

    .line 534
    :cond_16
    invoke-static {v1, v7}, Lcom/google/android/gms/internal/measurement/P1;->M(Landroid/os/Parcel;I)I

    .line 535
    .line 536
    .line 537
    move-result v5

    .line 538
    goto :goto_5

    .line 539
    :cond_17
    invoke-static {v1, v2}, Lcom/google/android/gms/internal/measurement/P1;->y(Landroid/os/Parcel;I)V

    .line 540
    .line 541
    .line 542
    new-instance v1, Lx3/s;

    .line 543
    .line 544
    invoke-direct {v1, v5, v3, v6, v4}, Lx3/s;-><init>(ILandroid/accounts/Account;ILcom/google/android/gms/auth/api/signin/GoogleSignInAccount;)V

    .line 545
    .line 546
    .line 547
    return-object v1

    .line 548
    :pswitch_1a
    invoke-static {v1}, Lcom/google/android/gms/internal/measurement/P1;->f0(Landroid/os/Parcel;)I

    .line 549
    .line 550
    .line 551
    move-result v2

    .line 552
    const/4 v3, -0x1

    .line 553
    const/4 v4, 0x0

    .line 554
    const/4 v5, 0x0

    .line 555
    const-wide/16 v6, 0x0

    .line 556
    .line 557
    move/from16 v19, v3

    .line 558
    .line 559
    move v9, v4

    .line 560
    move v10, v9

    .line 561
    move v11, v10

    .line 562
    move/from16 v18, v11

    .line 563
    .line 564
    move-object/from16 v16, v5

    .line 565
    .line 566
    move-object/from16 v17, v16

    .line 567
    .line 568
    move-wide v12, v6

    .line 569
    move-wide v14, v12

    .line 570
    :goto_6
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 571
    .line 572
    .line 573
    move-result v3

    .line 574
    if-ge v3, v2, :cond_18

    .line 575
    .line 576
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 577
    .line 578
    .line 579
    move-result v3

    .line 580
    int-to-char v4, v3

    .line 581
    packed-switch v4, :pswitch_data_3

    .line 582
    .line 583
    .line 584
    invoke-static {v1, v3}, Lcom/google/android/gms/internal/measurement/P1;->c0(Landroid/os/Parcel;I)V

    .line 585
    .line 586
    .line 587
    goto :goto_6

    .line 588
    :pswitch_1b
    invoke-static {v1, v3}, Lcom/google/android/gms/internal/measurement/P1;->M(Landroid/os/Parcel;I)I

    .line 589
    .line 590
    .line 591
    move-result v3

    .line 592
    move/from16 v19, v3

    .line 593
    .line 594
    goto :goto_6

    .line 595
    :pswitch_1c
    invoke-static {v1, v3}, Lcom/google/android/gms/internal/measurement/P1;->M(Landroid/os/Parcel;I)I

    .line 596
    .line 597
    .line 598
    move-result v3

    .line 599
    move/from16 v18, v3

    .line 600
    .line 601
    goto :goto_6

    .line 602
    :pswitch_1d
    invoke-static {v1, v3}, Lcom/google/android/gms/internal/measurement/P1;->u(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 603
    .line 604
    .line 605
    move-result-object v3

    .line 606
    move-object/from16 v17, v3

    .line 607
    .line 608
    goto :goto_6

    .line 609
    :pswitch_1e
    invoke-static {v1, v3}, Lcom/google/android/gms/internal/measurement/P1;->u(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 610
    .line 611
    .line 612
    move-result-object v3

    .line 613
    move-object/from16 v16, v3

    .line 614
    .line 615
    goto :goto_6

    .line 616
    :pswitch_1f
    invoke-static {v1, v3}, Lcom/google/android/gms/internal/measurement/P1;->N(Landroid/os/Parcel;I)J

    .line 617
    .line 618
    .line 619
    move-result-wide v3

    .line 620
    move-wide v14, v3

    .line 621
    goto :goto_6

    .line 622
    :pswitch_20
    invoke-static {v1, v3}, Lcom/google/android/gms/internal/measurement/P1;->N(Landroid/os/Parcel;I)J

    .line 623
    .line 624
    .line 625
    move-result-wide v3

    .line 626
    move-wide v12, v3

    .line 627
    goto :goto_6

    .line 628
    :pswitch_21
    invoke-static {v1, v3}, Lcom/google/android/gms/internal/measurement/P1;->M(Landroid/os/Parcel;I)I

    .line 629
    .line 630
    .line 631
    move-result v3

    .line 632
    move v11, v3

    .line 633
    goto :goto_6

    .line 634
    :pswitch_22
    invoke-static {v1, v3}, Lcom/google/android/gms/internal/measurement/P1;->M(Landroid/os/Parcel;I)I

    .line 635
    .line 636
    .line 637
    move-result v3

    .line 638
    move v10, v3

    .line 639
    goto :goto_6

    .line 640
    :pswitch_23
    invoke-static {v1, v3}, Lcom/google/android/gms/internal/measurement/P1;->M(Landroid/os/Parcel;I)I

    .line 641
    .line 642
    .line 643
    move-result v3

    .line 644
    move v9, v3

    .line 645
    goto :goto_6

    .line 646
    :cond_18
    invoke-static {v1, v2}, Lcom/google/android/gms/internal/measurement/P1;->y(Landroid/os/Parcel;I)V

    .line 647
    .line 648
    .line 649
    new-instance v8, Lx3/j;

    .line 650
    .line 651
    invoke-direct/range {v8 .. v19}, Lx3/j;-><init>(IIIJJLjava/lang/String;Ljava/lang/String;II)V

    .line 652
    .line 653
    .line 654
    return-object v8

    .line 655
    :pswitch_24
    invoke-static {v1}, Lcom/google/android/gms/internal/measurement/P1;->f0(Landroid/os/Parcel;)I

    .line 656
    .line 657
    .line 658
    move-result v2

    .line 659
    const/4 v3, 0x0

    .line 660
    const/4 v4, 0x0

    .line 661
    :goto_7
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 662
    .line 663
    .line 664
    move-result v5

    .line 665
    if-ge v5, v2, :cond_1b

    .line 666
    .line 667
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 668
    .line 669
    .line 670
    move-result v5

    .line 671
    int-to-char v6, v5

    .line 672
    const/4 v7, 0x1

    .line 673
    if-eq v6, v7, :cond_1a

    .line 674
    .line 675
    const/4 v7, 0x2

    .line 676
    if-eq v6, v7, :cond_19

    .line 677
    .line 678
    invoke-static {v1, v5}, Lcom/google/android/gms/internal/measurement/P1;->c0(Landroid/os/Parcel;I)V

    .line 679
    .line 680
    .line 681
    goto :goto_7

    .line 682
    :cond_19
    sget-object v3, Lx3/j;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 683
    .line 684
    invoke-static {v1, v5, v3}, Lcom/google/android/gms/internal/measurement/P1;->w(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Ljava/util/ArrayList;

    .line 685
    .line 686
    .line 687
    move-result-object v3

    .line 688
    goto :goto_7

    .line 689
    :cond_1a
    invoke-static {v1, v5}, Lcom/google/android/gms/internal/measurement/P1;->M(Landroid/os/Parcel;I)I

    .line 690
    .line 691
    .line 692
    move-result v4

    .line 693
    goto :goto_7

    .line 694
    :cond_1b
    invoke-static {v1, v2}, Lcom/google/android/gms/internal/measurement/P1;->y(Landroid/os/Parcel;I)V

    .line 695
    .line 696
    .line 697
    new-instance v1, Lx3/m;

    .line 698
    .line 699
    invoke-direct {v1, v4, v3}, Lx3/m;-><init>(ILjava/util/List;)V

    .line 700
    .line 701
    .line 702
    return-object v1

    .line 703
    :pswitch_25
    invoke-static {v1}, Lcom/google/android/gms/internal/measurement/P1;->f0(Landroid/os/Parcel;)I

    .line 704
    .line 705
    .line 706
    move-result v2

    .line 707
    const/4 v3, 0x0

    .line 708
    const/4 v4, 0x0

    .line 709
    move-object v7, v3

    .line 710
    move-object v8, v7

    .line 711
    move-object v10, v8

    .line 712
    move v6, v4

    .line 713
    move v9, v6

    .line 714
    :goto_8
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 715
    .line 716
    .line 717
    move-result v5

    .line 718
    if-ge v5, v2, :cond_22

    .line 719
    .line 720
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 721
    .line 722
    .line 723
    move-result v5

    .line 724
    int-to-char v11, v5

    .line 725
    const/4 v12, 0x1

    .line 726
    if-eq v11, v12, :cond_20

    .line 727
    .line 728
    const/4 v12, 0x2

    .line 729
    if-eq v11, v12, :cond_1f

    .line 730
    .line 731
    const/4 v12, 0x3

    .line 732
    if-eq v11, v12, :cond_1e

    .line 733
    .line 734
    const/4 v12, 0x4

    .line 735
    if-eq v11, v12, :cond_1d

    .line 736
    .line 737
    const/16 v12, 0x3e8

    .line 738
    .line 739
    if-eq v11, v12, :cond_1c

    .line 740
    .line 741
    invoke-static {v1, v5}, Lcom/google/android/gms/internal/measurement/P1;->c0(Landroid/os/Parcel;I)V

    .line 742
    .line 743
    .line 744
    goto :goto_8

    .line 745
    :cond_1c
    invoke-static {v1, v5}, Lcom/google/android/gms/internal/measurement/P1;->M(Landroid/os/Parcel;I)I

    .line 746
    .line 747
    .line 748
    move-result v6

    .line 749
    goto :goto_8

    .line 750
    :cond_1d
    invoke-static {v1, v5}, Lcom/google/android/gms/internal/measurement/P1;->o(Landroid/os/Parcel;I)Landroid/os/Bundle;

    .line 751
    .line 752
    .line 753
    move-result-object v10

    .line 754
    goto :goto_8

    .line 755
    :cond_1e
    invoke-static {v1, v5}, Lcom/google/android/gms/internal/measurement/P1;->M(Landroid/os/Parcel;I)I

    .line 756
    .line 757
    .line 758
    move-result v9

    .line 759
    goto :goto_8

    .line 760
    :cond_1f
    sget-object v8, Landroid/database/CursorWindow;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 761
    .line 762
    invoke-static {v1, v5, v8}, Lcom/google/android/gms/internal/measurement/P1;->v(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)[Ljava/lang/Object;

    .line 763
    .line 764
    .line 765
    move-result-object v5

    .line 766
    move-object v8, v5

    .line 767
    check-cast v8, [Landroid/database/CursorWindow;

    .line 768
    .line 769
    goto :goto_8

    .line 770
    :cond_20
    invoke-static {v1, v5}, Lcom/google/android/gms/internal/measurement/P1;->O(Landroid/os/Parcel;I)I

    .line 771
    .line 772
    .line 773
    move-result v5

    .line 774
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 775
    .line 776
    .line 777
    move-result v7

    .line 778
    if-nez v5, :cond_21

    .line 779
    .line 780
    move-object v7, v3

    .line 781
    goto :goto_8

    .line 782
    :cond_21
    invoke-virtual {v1}, Landroid/os/Parcel;->createStringArray()[Ljava/lang/String;

    .line 783
    .line 784
    .line 785
    move-result-object v11

    .line 786
    add-int/2addr v7, v5

    .line 787
    invoke-virtual {v1, v7}, Landroid/os/Parcel;->setDataPosition(I)V

    .line 788
    .line 789
    .line 790
    move-object v7, v11

    .line 791
    goto :goto_8

    .line 792
    :cond_22
    invoke-static {v1, v2}, Lcom/google/android/gms/internal/measurement/P1;->y(Landroid/os/Parcel;I)V

    .line 793
    .line 794
    .line 795
    new-instance v5, Lcom/google/android/gms/common/data/DataHolder;

    .line 796
    .line 797
    invoke-direct/range {v5 .. v10}, Lcom/google/android/gms/common/data/DataHolder;-><init>(I[Ljava/lang/String;[Landroid/database/CursorWindow;ILandroid/os/Bundle;)V

    .line 798
    .line 799
    .line 800
    new-instance v1, Landroid/os/Bundle;

    .line 801
    .line 802
    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    .line 803
    .line 804
    .line 805
    iput-object v1, v5, Lcom/google/android/gms/common/data/DataHolder;->s:Landroid/os/Bundle;

    .line 806
    .line 807
    move v1, v4

    .line 808
    :goto_9
    iget-object v2, v5, Lcom/google/android/gms/common/data/DataHolder;->r:[Ljava/lang/String;

    .line 809
    .line 810
    array-length v3, v2

    .line 811
    if-ge v1, v3, :cond_23

    .line 812
    .line 813
    iget-object v3, v5, Lcom/google/android/gms/common/data/DataHolder;->s:Landroid/os/Bundle;

    .line 814
    .line 815
    aget-object v2, v2, v1

    .line 816
    .line 817
    invoke-virtual {v3, v2, v1}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 818
    .line 819
    .line 820
    add-int/lit8 v1, v1, 0x1

    .line 821
    .line 822
    goto :goto_9

    .line 823
    :cond_23
    iget-object v1, v5, Lcom/google/android/gms/common/data/DataHolder;->t:[Landroid/database/CursorWindow;

    .line 824
    .line 825
    array-length v2, v1

    .line 826
    new-array v2, v2, [I

    .line 827
    .line 828
    iput-object v2, v5, Lcom/google/android/gms/common/data/DataHolder;->w:[I

    .line 829
    .line 830
    move v2, v4

    .line 831
    :goto_a
    array-length v3, v1

    .line 832
    if-ge v4, v3, :cond_24

    .line 833
    .line 834
    iget-object v3, v5, Lcom/google/android/gms/common/data/DataHolder;->w:[I

    .line 835
    .line 836
    aput v2, v3, v4

    .line 837
    .line 838
    aget-object v3, v1, v4

    .line 839
    .line 840
    invoke-virtual {v3}, Landroid/database/CursorWindow;->getStartPosition()I

    .line 841
    .line 842
    .line 843
    move-result v3

    .line 844
    sub-int v3, v2, v3

    .line 845
    .line 846
    aget-object v6, v1, v4

    .line 847
    .line 848
    invoke-virtual {v6}, Landroid/database/CursorWindow;->getNumRows()I

    .line 849
    .line 850
    .line 851
    move-result v6

    .line 852
    sub-int/2addr v6, v3

    .line 853
    add-int/2addr v2, v6

    .line 854
    add-int/lit8 v4, v4, 0x1

    .line 855
    .line 856
    goto :goto_a

    .line 857
    :cond_24
    return-object v5

    .line 858
    :pswitch_26
    invoke-static {v1}, Lcom/google/android/gms/internal/measurement/P1;->f0(Landroid/os/Parcel;)I

    .line 859
    .line 860
    .line 861
    move-result v2

    .line 862
    const/4 v3, 0x0

    .line 863
    const/4 v4, 0x0

    .line 864
    move-object v5, v3

    .line 865
    move v6, v4

    .line 866
    move-object v4, v5

    .line 867
    :goto_b
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 868
    .line 869
    .line 870
    move-result v7

    .line 871
    if-ge v7, v2, :cond_29

    .line 872
    .line 873
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 874
    .line 875
    .line 876
    move-result v7

    .line 877
    int-to-char v8, v7

    .line 878
    const/4 v9, 0x1

    .line 879
    if-eq v8, v9, :cond_28

    .line 880
    .line 881
    const/4 v9, 0x2

    .line 882
    if-eq v8, v9, :cond_27

    .line 883
    .line 884
    const/4 v9, 0x3

    .line 885
    if-eq v8, v9, :cond_26

    .line 886
    .line 887
    const/4 v9, 0x4

    .line 888
    if-eq v8, v9, :cond_25

    .line 889
    .line 890
    invoke-static {v1, v7}, Lcom/google/android/gms/internal/measurement/P1;->c0(Landroid/os/Parcel;I)V

    .line 891
    .line 892
    .line 893
    goto :goto_b

    .line 894
    :cond_25
    sget-object v5, Lcom/google/android/gms/common/b;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 895
    .line 896
    invoke-static {v1, v7, v5}, Lcom/google/android/gms/internal/measurement/P1;->t(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 897
    .line 898
    .line 899
    move-result-object v5

    .line 900
    check-cast v5, Lcom/google/android/gms/common/b;

    .line 901
    .line 902
    goto :goto_b

    .line 903
    :cond_26
    sget-object v4, Landroid/app/PendingIntent;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 904
    .line 905
    invoke-static {v1, v7, v4}, Lcom/google/android/gms/internal/measurement/P1;->t(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 906
    .line 907
    .line 908
    move-result-object v4

    .line 909
    check-cast v4, Landroid/app/PendingIntent;

    .line 910
    .line 911
    goto :goto_b

    .line 912
    :cond_27
    invoke-static {v1, v7}, Lcom/google/android/gms/internal/measurement/P1;->u(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 913
    .line 914
    .line 915
    move-result-object v3

    .line 916
    goto :goto_b

    .line 917
    :cond_28
    invoke-static {v1, v7}, Lcom/google/android/gms/internal/measurement/P1;->M(Landroid/os/Parcel;I)I

    .line 918
    .line 919
    .line 920
    move-result v6

    .line 921
    goto :goto_b

    .line 922
    :cond_29
    invoke-static {v1, v2}, Lcom/google/android/gms/internal/measurement/P1;->y(Landroid/os/Parcel;I)V

    .line 923
    .line 924
    .line 925
    new-instance v1, Lcom/google/android/gms/common/api/Status;

    .line 926
    .line 927
    invoke-direct {v1, v6, v3, v4, v5}, Lcom/google/android/gms/common/api/Status;-><init>(ILjava/lang/String;Landroid/app/PendingIntent;Lcom/google/android/gms/common/b;)V

    .line 928
    .line 929
    .line 930
    return-object v1

    .line 931
    :pswitch_27
    invoke-static {v1}, Lcom/google/android/gms/internal/measurement/P1;->f0(Landroid/os/Parcel;)I

    .line 932
    .line 933
    .line 934
    move-result v2

    .line 935
    const/4 v3, 0x0

    .line 936
    const/4 v4, 0x0

    .line 937
    :goto_c
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 938
    .line 939
    .line 940
    move-result v5

    .line 941
    if-ge v5, v2, :cond_2c

    .line 942
    .line 943
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 944
    .line 945
    .line 946
    move-result v5

    .line 947
    int-to-char v6, v5

    .line 948
    const/4 v7, 0x1

    .line 949
    if-eq v6, v7, :cond_2b

    .line 950
    .line 951
    const/4 v7, 0x2

    .line 952
    if-eq v6, v7, :cond_2a

    .line 953
    .line 954
    invoke-static {v1, v5}, Lcom/google/android/gms/internal/measurement/P1;->c0(Landroid/os/Parcel;I)V

    .line 955
    .line 956
    .line 957
    goto :goto_c

    .line 958
    :cond_2a
    invoke-static {v1, v5}, Lcom/google/android/gms/internal/measurement/P1;->u(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 959
    .line 960
    .line 961
    move-result-object v3

    .line 962
    goto :goto_c

    .line 963
    :cond_2b
    invoke-static {v1, v5}, Lcom/google/android/gms/internal/measurement/P1;->M(Landroid/os/Parcel;I)I

    .line 964
    .line 965
    .line 966
    move-result v4

    .line 967
    goto :goto_c

    .line 968
    :cond_2c
    invoke-static {v1, v2}, Lcom/google/android/gms/internal/measurement/P1;->y(Landroid/os/Parcel;I)V

    .line 969
    .line 970
    .line 971
    new-instance v1, Lcom/google/android/gms/common/api/Scope;

    .line 972
    .line 973
    invoke-direct {v1, v4, v3}, Lcom/google/android/gms/common/api/Scope;-><init>(ILjava/lang/String;)V

    .line 974
    .line 975
    .line 976
    return-object v1

    .line 977
    :pswitch_28
    invoke-static {v1}, Lcom/google/android/gms/internal/measurement/P1;->f0(Landroid/os/Parcel;)I

    .line 978
    .line 979
    .line 980
    move-result v2

    .line 981
    const/4 v3, 0x0

    .line 982
    const/4 v4, 0x1

    .line 983
    move-object v6, v3

    .line 984
    move-object v7, v6

    .line 985
    move-object v8, v7

    .line 986
    move-object v9, v8

    .line 987
    move-object v10, v9

    .line 988
    move-object v11, v10

    .line 989
    move-object v13, v11

    .line 990
    move v12, v4

    .line 991
    :goto_d
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 992
    .line 993
    .line 994
    move-result v4

    .line 995
    if-ge v4, v2, :cond_2e

    .line 996
    .line 997
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 998
    .line 999
    .line 1000
    move-result v4

    .line 1001
    int-to-char v5, v4

    .line 1002
    packed-switch v5, :pswitch_data_4

    .line 1003
    .line 1004
    .line 1005
    invoke-static {v1, v4}, Lcom/google/android/gms/internal/measurement/P1;->c0(Landroid/os/Parcel;I)V

    .line 1006
    .line 1007
    .line 1008
    goto :goto_d

    .line 1009
    :pswitch_29
    sget-object v5, LP3/a;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 1010
    .line 1011
    invoke-static {v1, v4, v5}, Lcom/google/android/gms/internal/measurement/P1;->v(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)[Ljava/lang/Object;

    .line 1012
    .line 1013
    .line 1014
    move-result-object v4

    .line 1015
    move-object v13, v4

    .line 1016
    check-cast v13, [LP3/a;

    .line 1017
    .line 1018
    goto :goto_d

    .line 1019
    :pswitch_2a
    invoke-static {v1, v4}, Lcom/google/android/gms/internal/measurement/P1;->K(Landroid/os/Parcel;I)Z

    .line 1020
    .line 1021
    .line 1022
    move-result v12

    .line 1023
    goto :goto_d

    .line 1024
    :pswitch_2b
    invoke-static {v1, v4}, Lcom/google/android/gms/internal/measurement/P1;->q(Landroid/os/Parcel;I)[[B

    .line 1025
    .line 1026
    .line 1027
    move-result-object v11

    .line 1028
    goto :goto_d

    .line 1029
    :pswitch_2c
    invoke-static {v1, v4}, Lcom/google/android/gms/internal/measurement/P1;->s(Landroid/os/Parcel;I)[I

    .line 1030
    .line 1031
    .line 1032
    move-result-object v10

    .line 1033
    goto :goto_d

    .line 1034
    :pswitch_2d
    invoke-static {v1, v4}, Lcom/google/android/gms/internal/measurement/P1;->O(Landroid/os/Parcel;I)I

    .line 1035
    .line 1036
    .line 1037
    move-result v4

    .line 1038
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 1039
    .line 1040
    .line 1041
    move-result v5

    .line 1042
    if-nez v4, :cond_2d

    .line 1043
    .line 1044
    move-object v9, v3

    .line 1045
    goto :goto_d

    .line 1046
    :cond_2d
    invoke-virtual {v1}, Landroid/os/Parcel;->createStringArray()[Ljava/lang/String;

    .line 1047
    .line 1048
    .line 1049
    move-result-object v9

    .line 1050
    add-int/2addr v5, v4

    .line 1051
    invoke-virtual {v1, v5}, Landroid/os/Parcel;->setDataPosition(I)V

    .line 1052
    .line 1053
    .line 1054
    goto :goto_d

    .line 1055
    :pswitch_2e
    invoke-static {v1, v4}, Lcom/google/android/gms/internal/measurement/P1;->s(Landroid/os/Parcel;I)[I

    .line 1056
    .line 1057
    .line 1058
    move-result-object v8

    .line 1059
    goto :goto_d

    .line 1060
    :pswitch_2f
    invoke-static {v1, v4}, Lcom/google/android/gms/internal/measurement/P1;->p(Landroid/os/Parcel;I)[B

    .line 1061
    .line 1062
    .line 1063
    move-result-object v7

    .line 1064
    goto :goto_d

    .line 1065
    :pswitch_30
    sget-object v5, Lcom/google/android/gms/internal/clearcut/C0;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 1066
    .line 1067
    invoke-static {v1, v4, v5}, Lcom/google/android/gms/internal/measurement/P1;->t(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 1068
    .line 1069
    .line 1070
    move-result-object v4

    .line 1071
    move-object v6, v4

    .line 1072
    check-cast v6, Lcom/google/android/gms/internal/clearcut/C0;

    .line 1073
    .line 1074
    goto :goto_d

    .line 1075
    :cond_2e
    invoke-static {v1, v2}, Lcom/google/android/gms/internal/measurement/P1;->y(Landroid/os/Parcel;I)V

    .line 1076
    .line 1077
    .line 1078
    new-instance v5, Lt3/c;

    .line 1079
    .line 1080
    invoke-direct/range {v5 .. v13}, Lt3/c;-><init>(Lcom/google/android/gms/internal/clearcut/C0;[B[I[Ljava/lang/String;[I[[BZ[LP3/a;)V

    .line 1081
    .line 1082
    .line 1083
    return-object v5

    .line 1084
    :pswitch_31
    invoke-static {v1}, Lcom/google/android/gms/internal/measurement/P1;->f0(Landroid/os/Parcel;)I

    .line 1085
    .line 1086
    .line 1087
    move-result v2

    .line 1088
    const/4 v3, 0x0

    .line 1089
    const-wide/16 v4, 0x0

    .line 1090
    .line 1091
    move v11, v3

    .line 1092
    move-wide v7, v4

    .line 1093
    move-wide v9, v7

    .line 1094
    :goto_e
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 1095
    .line 1096
    .line 1097
    move-result v3

    .line 1098
    if-ge v3, v2, :cond_32

    .line 1099
    .line 1100
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 1101
    .line 1102
    .line 1103
    move-result v3

    .line 1104
    int-to-char v4, v3

    .line 1105
    const/4 v5, 0x1

    .line 1106
    if-eq v4, v5, :cond_31

    .line 1107
    .line 1108
    const/4 v5, 0x2

    .line 1109
    if-eq v4, v5, :cond_30

    .line 1110
    .line 1111
    const/4 v5, 0x3

    .line 1112
    if-eq v4, v5, :cond_2f

    .line 1113
    .line 1114
    invoke-static {v1, v3}, Lcom/google/android/gms/internal/measurement/P1;->c0(Landroid/os/Parcel;I)V

    .line 1115
    .line 1116
    .line 1117
    goto :goto_e

    .line 1118
    :cond_2f
    invoke-static {v1, v3}, Lcom/google/android/gms/internal/measurement/P1;->N(Landroid/os/Parcel;I)J

    .line 1119
    .line 1120
    .line 1121
    move-result-wide v7

    .line 1122
    goto :goto_e

    .line 1123
    :cond_30
    invoke-static {v1, v3}, Lcom/google/android/gms/internal/measurement/P1;->N(Landroid/os/Parcel;I)J

    .line 1124
    .line 1125
    .line 1126
    move-result-wide v9

    .line 1127
    goto :goto_e

    .line 1128
    :cond_31
    invoke-static {v1, v3}, Lcom/google/android/gms/internal/measurement/P1;->K(Landroid/os/Parcel;I)Z

    .line 1129
    .line 1130
    .line 1131
    move-result v11

    .line 1132
    goto :goto_e

    .line 1133
    :cond_32
    invoke-static {v1, v2}, Lcom/google/android/gms/internal/measurement/P1;->y(Landroid/os/Parcel;I)V

    .line 1134
    .line 1135
    .line 1136
    new-instance v6, Lt3/b;

    .line 1137
    .line 1138
    invoke-direct/range {v6 .. v11}, Lt3/b;-><init>(JJZ)V

    .line 1139
    .line 1140
    .line 1141
    return-object v6

    .line 1142
    :pswitch_32
    new-instance v2, Landroidx/versionedparcelable/ParcelImpl;

    .line 1143
    .line 1144
    invoke-direct {v2, v1}, Landroidx/versionedparcelable/ParcelImpl;-><init>(Landroid/os/Parcel;)V

    .line 1145
    .line 1146
    .line 1147
    return-object v2

    .line 1148
    :pswitch_33
    invoke-static {v1}, Lcom/google/android/gms/internal/measurement/P1;->f0(Landroid/os/Parcel;)I

    .line 1149
    .line 1150
    .line 1151
    move-result v2

    .line 1152
    const/4 v3, 0x0

    .line 1153
    const-wide/16 v4, 0x0

    .line 1154
    .line 1155
    const/4 v6, 0x0

    .line 1156
    move-object v9, v3

    .line 1157
    move-object v10, v9

    .line 1158
    move-object v11, v10

    .line 1159
    move-object v12, v11

    .line 1160
    move-object v13, v12

    .line 1161
    move-object v14, v13

    .line 1162
    move-object/from16 v17, v14

    .line 1163
    .line 1164
    move-object/from16 v18, v17

    .line 1165
    .line 1166
    move-object/from16 v19, v18

    .line 1167
    .line 1168
    move-object/from16 v20, v19

    .line 1169
    .line 1170
    move-wide v15, v4

    .line 1171
    move v8, v6

    .line 1172
    :goto_f
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 1173
    .line 1174
    .line 1175
    move-result v3

    .line 1176
    if-ge v3, v2, :cond_33

    .line 1177
    .line 1178
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 1179
    .line 1180
    .line 1181
    move-result v3

    .line 1182
    int-to-char v4, v3

    .line 1183
    packed-switch v4, :pswitch_data_5

    .line 1184
    .line 1185
    .line 1186
    invoke-static {v1, v3}, Lcom/google/android/gms/internal/measurement/P1;->c0(Landroid/os/Parcel;I)V

    .line 1187
    .line 1188
    .line 1189
    goto :goto_f

    .line 1190
    :pswitch_34
    invoke-static {v1, v3}, Lcom/google/android/gms/internal/measurement/P1;->u(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 1191
    .line 1192
    .line 1193
    move-result-object v3

    .line 1194
    move-object/from16 v20, v3

    .line 1195
    .line 1196
    goto :goto_f

    .line 1197
    :pswitch_35
    invoke-static {v1, v3}, Lcom/google/android/gms/internal/measurement/P1;->u(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 1198
    .line 1199
    .line 1200
    move-result-object v3

    .line 1201
    move-object/from16 v19, v3

    .line 1202
    .line 1203
    goto :goto_f

    .line 1204
    :pswitch_36
    sget-object v4, Lcom/google/android/gms/common/api/Scope;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 1205
    .line 1206
    invoke-static {v1, v3, v4}, Lcom/google/android/gms/internal/measurement/P1;->w(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Ljava/util/ArrayList;

    .line 1207
    .line 1208
    .line 1209
    move-result-object v3

    .line 1210
    move-object/from16 v18, v3

    .line 1211
    .line 1212
    goto :goto_f

    .line 1213
    :pswitch_37
    invoke-static {v1, v3}, Lcom/google/android/gms/internal/measurement/P1;->u(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 1214
    .line 1215
    .line 1216
    move-result-object v3

    .line 1217
    move-object/from16 v17, v3

    .line 1218
    .line 1219
    goto :goto_f

    .line 1220
    :pswitch_38
    invoke-static {v1, v3}, Lcom/google/android/gms/internal/measurement/P1;->N(Landroid/os/Parcel;I)J

    .line 1221
    .line 1222
    .line 1223
    move-result-wide v3

    .line 1224
    move-wide v15, v3

    .line 1225
    goto :goto_f

    .line 1226
    :pswitch_39
    invoke-static {v1, v3}, Lcom/google/android/gms/internal/measurement/P1;->u(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 1227
    .line 1228
    .line 1229
    move-result-object v3

    .line 1230
    move-object v14, v3

    .line 1231
    goto :goto_f

    .line 1232
    :pswitch_3a
    sget-object v4, Landroid/net/Uri;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 1233
    .line 1234
    invoke-static {v1, v3, v4}, Lcom/google/android/gms/internal/measurement/P1;->t(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 1235
    .line 1236
    .line 1237
    move-result-object v3

    .line 1238
    check-cast v3, Landroid/net/Uri;

    .line 1239
    .line 1240
    move-object v13, v3

    .line 1241
    goto :goto_f

    .line 1242
    :pswitch_3b
    invoke-static {v1, v3}, Lcom/google/android/gms/internal/measurement/P1;->u(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 1243
    .line 1244
    .line 1245
    move-result-object v3

    .line 1246
    move-object v12, v3

    .line 1247
    goto :goto_f

    .line 1248
    :pswitch_3c
    invoke-static {v1, v3}, Lcom/google/android/gms/internal/measurement/P1;->u(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 1249
    .line 1250
    .line 1251
    move-result-object v3

    .line 1252
    move-object v11, v3

    .line 1253
    goto :goto_f

    .line 1254
    :pswitch_3d
    invoke-static {v1, v3}, Lcom/google/android/gms/internal/measurement/P1;->u(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 1255
    .line 1256
    .line 1257
    move-result-object v3

    .line 1258
    move-object v10, v3

    .line 1259
    goto :goto_f

    .line 1260
    :pswitch_3e
    invoke-static {v1, v3}, Lcom/google/android/gms/internal/measurement/P1;->u(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 1261
    .line 1262
    .line 1263
    move-result-object v3

    .line 1264
    move-object v9, v3

    .line 1265
    goto :goto_f

    .line 1266
    :pswitch_3f
    invoke-static {v1, v3}, Lcom/google/android/gms/internal/measurement/P1;->M(Landroid/os/Parcel;I)I

    .line 1267
    .line 1268
    .line 1269
    move-result v3

    .line 1270
    move v8, v3

    .line 1271
    goto :goto_f

    .line 1272
    :cond_33
    invoke-static {v1, v2}, Lcom/google/android/gms/internal/measurement/P1;->y(Landroid/os/Parcel;I)V

    .line 1273
    .line 1274
    .line 1275
    new-instance v7, Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;

    .line 1276
    .line 1277
    invoke-direct/range {v7 .. v20}, Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/net/Uri;Ljava/lang/String;JLjava/lang/String;Ljava/util/ArrayList;Ljava/lang/String;Ljava/lang/String;)V

    .line 1278
    .line 1279
    .line 1280
    return-object v7

    .line 1281
    :pswitch_40
    new-instance v2, Lo2/l;

    .line 1282
    .line 1283
    invoke-direct {v2, v1}, Lo2/l;-><init>(Landroid/os/Parcel;)V

    .line 1284
    .line 1285
    .line 1286
    return-object v2

    .line 1287
    :pswitch_41
    new-instance v2, Ln4/f;

    .line 1288
    .line 1289
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 1290
    .line 1291
    .line 1292
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 1293
    .line 1294
    .line 1295
    move-result v3

    .line 1296
    iput v3, v2, Ln4/f;->q:I

    .line 1297
    .line 1298
    const-class v3, Ln4/f;

    .line 1299
    .line 1300
    invoke-virtual {v3}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 1301
    .line 1302
    .line 1303
    move-result-object v3

    .line 1304
    invoke-virtual {v1, v3}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    .line 1305
    .line 1306
    .line 1307
    move-result-object v1

    .line 1308
    check-cast v1, Ll4/f;

    .line 1309
    .line 1310
    iput-object v1, v2, Ln4/f;->r:Ll4/f;

    .line 1311
    .line 1312
    return-object v2

    .line 1313
    :pswitch_42
    new-instance v2, Lm/M;

    .line 1314
    .line 1315
    invoke-direct {v2, v1}, Landroid/view/View$BaseSavedState;-><init>(Landroid/os/Parcel;)V

    .line 1316
    .line 1317
    .line 1318
    invoke-virtual {v1}, Landroid/os/Parcel;->readByte()B

    .line 1319
    .line 1320
    .line 1321
    move-result v1

    .line 1322
    if-eqz v1, :cond_34

    .line 1323
    .line 1324
    const/4 v1, 0x1

    .line 1325
    goto :goto_10

    .line 1326
    :cond_34
    const/4 v1, 0x0

    .line 1327
    :goto_10
    iput-boolean v1, v2, Lm/M;->q:Z

    .line 1328
    .line 1329
    return-object v2

    .line 1330
    :pswitch_43
    new-instance v2, Lm/i;

    .line 1331
    .line 1332
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 1333
    .line 1334
    .line 1335
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 1336
    .line 1337
    .line 1338
    move-result v1

    .line 1339
    iput v1, v2, Lm/i;->q:I

    .line 1340
    .line 1341
    return-object v2

    .line 1342
    :pswitch_44
    new-instance v2, Lf4/b;

    .line 1343
    .line 1344
    invoke-direct {v2, v1}, Landroid/view/View$BaseSavedState;-><init>(Landroid/os/Parcel;)V

    .line 1345
    .line 1346
    .line 1347
    const-class v3, Lf4/b;

    .line 1348
    .line 1349
    invoke-virtual {v3}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 1350
    .line 1351
    .line 1352
    move-result-object v3

    .line 1353
    invoke-virtual {v1, v3}, Landroid/os/Parcel;->readValue(Ljava/lang/ClassLoader;)Ljava/lang/Object;

    .line 1354
    .line 1355
    .line 1356
    move-result-object v1

    .line 1357
    check-cast v1, Ljava/lang/Integer;

    .line 1358
    .line 1359
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 1360
    .line 1361
    .line 1362
    move-result v1

    .line 1363
    iput v1, v2, Lf4/b;->q:I

    .line 1364
    .line 1365
    return-object v2

    .line 1366
    :pswitch_45
    const-string v2, "inParcel"

    .line 1367
    .line 1368
    invoke-static {v1, v2}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1369
    .line 1370
    .line 1371
    new-instance v2, Le/h;

    .line 1372
    .line 1373
    const-class v3, Landroid/content/IntentSender;

    .line 1374
    .line 1375
    invoke-virtual {v3}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 1376
    .line 1377
    .line 1378
    move-result-object v3

    .line 1379
    invoke-virtual {v1, v3}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    .line 1380
    .line 1381
    .line 1382
    move-result-object v3

    .line 1383
    invoke-static {v3}, Lkotlin/jvm/internal/m;->b(Ljava/lang/Object;)V

    .line 1384
    .line 1385
    .line 1386
    check-cast v3, Landroid/content/IntentSender;

    .line 1387
    .line 1388
    const-class v4, Landroid/content/Intent;

    .line 1389
    .line 1390
    invoke-virtual {v4}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 1391
    .line 1392
    .line 1393
    move-result-object v4

    .line 1394
    invoke-virtual {v1, v4}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    .line 1395
    .line 1396
    .line 1397
    move-result-object v4

    .line 1398
    check-cast v4, Landroid/content/Intent;

    .line 1399
    .line 1400
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 1401
    .line 1402
    .line 1403
    move-result v5

    .line 1404
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 1405
    .line 1406
    .line 1407
    move-result v1

    .line 1408
    invoke-direct {v2, v3, v4, v5, v1}, Le/h;-><init>(Landroid/content/IntentSender;Landroid/content/Intent;II)V

    .line 1409
    .line 1410
    .line 1411
    return-object v2

    .line 1412
    :pswitch_46
    const-string v2, "parcel"

    .line 1413
    .line 1414
    invoke-static {v1, v2}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1415
    .line 1416
    .line 1417
    new-instance v2, Le/a;

    .line 1418
    .line 1419
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 1420
    .line 1421
    .line 1422
    move-result v3

    .line 1423
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 1424
    .line 1425
    .line 1426
    move-result v4

    .line 1427
    if-nez v4, :cond_35

    .line 1428
    .line 1429
    const/4 v1, 0x0

    .line 1430
    goto :goto_11

    .line 1431
    :cond_35
    sget-object v4, Landroid/content/Intent;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 1432
    .line 1433
    invoke-interface {v4, v1}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    .line 1434
    .line 1435
    .line 1436
    move-result-object v1

    .line 1437
    check-cast v1, Landroid/content/Intent;

    .line 1438
    .line 1439
    :goto_11
    invoke-direct {v2, v1, v3}, Le/a;-><init>(Landroid/content/Intent;I)V

    .line 1440
    .line 1441
    .line 1442
    return-object v2

    .line 1443
    :pswitch_47
    new-instance v2, Ld2/c0;

    .line 1444
    .line 1445
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 1446
    .line 1447
    .line 1448
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 1449
    .line 1450
    .line 1451
    move-result v3

    .line 1452
    iput v3, v2, Ld2/c0;->q:I

    .line 1453
    .line 1454
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 1455
    .line 1456
    .line 1457
    move-result v3

    .line 1458
    iput v3, v2, Ld2/c0;->r:I

    .line 1459
    .line 1460
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 1461
    .line 1462
    .line 1463
    move-result v3

    .line 1464
    iput v3, v2, Ld2/c0;->s:I

    .line 1465
    .line 1466
    if-lez v3, :cond_36

    .line 1467
    .line 1468
    new-array v3, v3, [I

    .line 1469
    .line 1470
    iput-object v3, v2, Ld2/c0;->t:[I

    .line 1471
    .line 1472
    invoke-virtual {v1, v3}, Landroid/os/Parcel;->readIntArray([I)V

    .line 1473
    .line 1474
    .line 1475
    :cond_36
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 1476
    .line 1477
    .line 1478
    move-result v3

    .line 1479
    iput v3, v2, Ld2/c0;->u:I

    .line 1480
    .line 1481
    if-lez v3, :cond_37

    .line 1482
    .line 1483
    new-array v3, v3, [I

    .line 1484
    .line 1485
    iput-object v3, v2, Ld2/c0;->v:[I

    .line 1486
    .line 1487
    invoke-virtual {v1, v3}, Landroid/os/Parcel;->readIntArray([I)V

    .line 1488
    .line 1489
    .line 1490
    :cond_37
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 1491
    .line 1492
    .line 1493
    move-result v3

    .line 1494
    const/4 v4, 0x0

    .line 1495
    const/4 v5, 0x1

    .line 1496
    if-ne v3, v5, :cond_38

    .line 1497
    .line 1498
    move v3, v5

    .line 1499
    goto :goto_12

    .line 1500
    :cond_38
    move v3, v4

    .line 1501
    :goto_12
    iput-boolean v3, v2, Ld2/c0;->x:Z

    .line 1502
    .line 1503
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 1504
    .line 1505
    .line 1506
    move-result v3

    .line 1507
    if-ne v3, v5, :cond_39

    .line 1508
    .line 1509
    move v3, v5

    .line 1510
    goto :goto_13

    .line 1511
    :cond_39
    move v3, v4

    .line 1512
    :goto_13
    iput-boolean v3, v2, Ld2/c0;->y:Z

    .line 1513
    .line 1514
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 1515
    .line 1516
    .line 1517
    move-result v3

    .line 1518
    if-ne v3, v5, :cond_3a

    .line 1519
    .line 1520
    move v4, v5

    .line 1521
    :cond_3a
    iput-boolean v4, v2, Ld2/c0;->z:Z

    .line 1522
    .line 1523
    const-class v3, Ld2/b0;

    .line 1524
    .line 1525
    invoke-virtual {v3}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 1526
    .line 1527
    .line 1528
    move-result-object v3

    .line 1529
    invoke-virtual {v1, v3}, Landroid/os/Parcel;->readArrayList(Ljava/lang/ClassLoader;)Ljava/util/ArrayList;

    .line 1530
    .line 1531
    .line 1532
    move-result-object v1

    .line 1533
    iput-object v1, v2, Ld2/c0;->w:Ljava/util/ArrayList;

    .line 1534
    .line 1535
    return-object v2

    .line 1536
    :pswitch_48
    new-instance v2, Ld2/b0;

    .line 1537
    .line 1538
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 1539
    .line 1540
    .line 1541
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 1542
    .line 1543
    .line 1544
    move-result v3

    .line 1545
    iput v3, v2, Ld2/b0;->q:I

    .line 1546
    .line 1547
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 1548
    .line 1549
    .line 1550
    move-result v3

    .line 1551
    iput v3, v2, Ld2/b0;->r:I

    .line 1552
    .line 1553
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 1554
    .line 1555
    .line 1556
    move-result v3

    .line 1557
    const/4 v4, 0x1

    .line 1558
    if-ne v3, v4, :cond_3b

    .line 1559
    .line 1560
    goto :goto_14

    .line 1561
    :cond_3b
    const/4 v4, 0x0

    .line 1562
    :goto_14
    iput-boolean v4, v2, Ld2/b0;->t:Z

    .line 1563
    .line 1564
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 1565
    .line 1566
    .line 1567
    move-result v3

    .line 1568
    if-lez v3, :cond_3c

    .line 1569
    .line 1570
    new-array v3, v3, [I

    .line 1571
    .line 1572
    iput-object v3, v2, Ld2/b0;->s:[I

    .line 1573
    .line 1574
    invoke-virtual {v1, v3}, Landroid/os/Parcel;->readIntArray([I)V

    .line 1575
    .line 1576
    .line 1577
    :cond_3c
    return-object v2

    .line 1578
    :pswitch_49
    new-instance v2, Ld2/s;

    .line 1579
    .line 1580
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 1581
    .line 1582
    .line 1583
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 1584
    .line 1585
    .line 1586
    move-result v3

    .line 1587
    iput v3, v2, Ld2/s;->q:I

    .line 1588
    .line 1589
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 1590
    .line 1591
    .line 1592
    move-result v3

    .line 1593
    iput v3, v2, Ld2/s;->r:I

    .line 1594
    .line 1595
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 1596
    .line 1597
    .line 1598
    move-result v1

    .line 1599
    const/4 v3, 0x1

    .line 1600
    if-ne v1, v3, :cond_3d

    .line 1601
    .line 1602
    goto :goto_15

    .line 1603
    :cond_3d
    const/4 v3, 0x0

    .line 1604
    :goto_15
    iput-boolean v3, v2, Ld2/s;->s:Z

    .line 1605
    .line 1606
    return-object v2

    .line 1607
    :pswitch_4a
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 1608
    .line 1609
    .line 1610
    move-result v2

    .line 1611
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 1612
    .line 1613
    .line 1614
    move-result v1

    .line 1615
    invoke-static {v2, v1}, Lcom/google/android/material/datepicker/q;->a(II)Lcom/google/android/material/datepicker/q;

    .line 1616
    .line 1617
    .line 1618
    move-result-object v1

    .line 1619
    return-object v1

    .line 1620
    nop

    .line 1621
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4a
        :pswitch_49
        :pswitch_48
        :pswitch_47
        :pswitch_46
        :pswitch_45
        :pswitch_44
        :pswitch_43
        :pswitch_42
        :pswitch_41
        :pswitch_40
        :pswitch_33
        :pswitch_32
        :pswitch_31
        :pswitch_28
        :pswitch_27
        :pswitch_26
        :pswitch_25
        :pswitch_24
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_f
    .end packed-switch

    .line 1622
    .line 1623
    .line 1624
    .line 1625
    .line 1626
    .line 1627
    .line 1628
    .line 1629
    .line 1630
    .line 1631
    .line 1632
    .line 1633
    .line 1634
    .line 1635
    .line 1636
    .line 1637
    .line 1638
    .line 1639
    .line 1640
    .line 1641
    .line 1642
    .line 1643
    .line 1644
    .line 1645
    .line 1646
    .line 1647
    .line 1648
    .line 1649
    .line 1650
    .line 1651
    .line 1652
    .line 1653
    .line 1654
    .line 1655
    .line 1656
    .line 1657
    .line 1658
    .line 1659
    .line 1660
    .line 1661
    .line 1662
    .line 1663
    .line 1664
    .line 1665
    .line 1666
    .line 1667
    .line 1668
    .line 1669
    .line 1670
    .line 1671
    .line 1672
    .line 1673
    .line 1674
    .line 1675
    :pswitch_data_1
    .packed-switch 0x1
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
    .end packed-switch

    .line 1676
    .line 1677
    .line 1678
    .line 1679
    .line 1680
    .line 1681
    .line 1682
    .line 1683
    .line 1684
    .line 1685
    .line 1686
    .line 1687
    .line 1688
    .line 1689
    .line 1690
    .line 1691
    .line 1692
    .line 1693
    .line 1694
    .line 1695
    .line 1696
    .line 1697
    .line 1698
    .line 1699
    .line 1700
    .line 1701
    .line 1702
    .line 1703
    .line 1704
    .line 1705
    .line 1706
    .line 1707
    .line 1708
    .line 1709
    :pswitch_data_2
    .packed-switch 0x1
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
    .end packed-switch

    .line 1710
    .line 1711
    .line 1712
    .line 1713
    .line 1714
    .line 1715
    .line 1716
    .line 1717
    .line 1718
    .line 1719
    .line 1720
    .line 1721
    .line 1722
    .line 1723
    .line 1724
    .line 1725
    :pswitch_data_3
    .packed-switch 0x1
        :pswitch_23
        :pswitch_22
        :pswitch_21
        :pswitch_20
        :pswitch_1f
        :pswitch_1e
        :pswitch_1d
        :pswitch_1c
        :pswitch_1b
    .end packed-switch

    .line 1726
    .line 1727
    .line 1728
    .line 1729
    .line 1730
    .line 1731
    .line 1732
    .line 1733
    .line 1734
    .line 1735
    .line 1736
    .line 1737
    .line 1738
    .line 1739
    .line 1740
    .line 1741
    .line 1742
    .line 1743
    .line 1744
    .line 1745
    .line 1746
    .line 1747
    :pswitch_data_4
    .packed-switch 0x2
        :pswitch_30
        :pswitch_2f
        :pswitch_2e
        :pswitch_2d
        :pswitch_2c
        :pswitch_2b
        :pswitch_2a
        :pswitch_29
    .end packed-switch

    .line 1748
    .line 1749
    .line 1750
    .line 1751
    .line 1752
    .line 1753
    .line 1754
    .line 1755
    .line 1756
    .line 1757
    .line 1758
    .line 1759
    .line 1760
    .line 1761
    .line 1762
    .line 1763
    .line 1764
    .line 1765
    .line 1766
    .line 1767
    :pswitch_data_5
    .packed-switch 0x1
        :pswitch_3f
        :pswitch_3e
        :pswitch_3d
        :pswitch_3c
        :pswitch_3b
        :pswitch_3a
        :pswitch_39
        :pswitch_38
        :pswitch_37
        :pswitch_36
        :pswitch_35
        :pswitch_34
    .end packed-switch
.end method

.method public final newArray(I)[Ljava/lang/Object;
    .locals 1

    .line 1
    iget v0, p0, Lcom/google/android/material/datepicker/p;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-array p1, p1, [Lx3/g;

    .line 7
    .line 8
    return-object p1

    .line 9
    :pswitch_0
    new-array p1, p1, [Lx3/f;

    .line 10
    .line 11
    return-object p1

    .line 12
    :pswitch_1
    new-array p1, p1, [Lx3/H;

    .line 13
    .line 14
    return-object p1

    .line 15
    :pswitch_2
    new-array p1, p1, [Lx3/l;

    .line 16
    .line 17
    return-object p1

    .line 18
    :pswitch_3
    new-array p1, p1, [Lx3/t;

    .line 19
    .line 20
    return-object p1

    .line 21
    :pswitch_4
    new-array p1, p1, [Lx3/s;

    .line 22
    .line 23
    return-object p1

    .line 24
    :pswitch_5
    new-array p1, p1, [Lx3/j;

    .line 25
    .line 26
    return-object p1

    .line 27
    :pswitch_6
    new-array p1, p1, [Lx3/m;

    .line 28
    .line 29
    return-object p1

    .line 30
    :pswitch_7
    new-array p1, p1, [Lcom/google/android/gms/common/data/DataHolder;

    .line 31
    .line 32
    return-object p1

    .line 33
    :pswitch_8
    new-array p1, p1, [Lcom/google/android/gms/common/api/Status;

    .line 34
    .line 35
    return-object p1

    .line 36
    :pswitch_9
    new-array p1, p1, [Lcom/google/android/gms/common/api/Scope;

    .line 37
    .line 38
    return-object p1

    .line 39
    :pswitch_a
    new-array p1, p1, [Lt3/c;

    .line 40
    .line 41
    return-object p1

    .line 42
    :pswitch_b
    new-array p1, p1, [Lt3/b;

    .line 43
    .line 44
    return-object p1

    .line 45
    :pswitch_c
    new-array p1, p1, [Landroidx/versionedparcelable/ParcelImpl;

    .line 46
    .line 47
    return-object p1

    .line 48
    :pswitch_d
    new-array p1, p1, [Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;

    .line 49
    .line 50
    return-object p1

    .line 51
    :pswitch_e
    new-array p1, p1, [Lo2/l;

    .line 52
    .line 53
    return-object p1

    .line 54
    :pswitch_f
    new-array p1, p1, [Ln4/f;

    .line 55
    .line 56
    return-object p1

    .line 57
    :pswitch_10
    new-array p1, p1, [Lm/M;

    .line 58
    .line 59
    return-object p1

    .line 60
    :pswitch_11
    new-array p1, p1, [Lm/i;

    .line 61
    .line 62
    return-object p1

    .line 63
    :pswitch_12
    new-array p1, p1, [Lf4/b;

    .line 64
    .line 65
    return-object p1

    .line 66
    :pswitch_13
    new-array p1, p1, [Le/h;

    .line 67
    .line 68
    return-object p1

    .line 69
    :pswitch_14
    new-array p1, p1, [Le/a;

    .line 70
    .line 71
    return-object p1

    .line 72
    :pswitch_15
    new-array p1, p1, [Ld2/c0;

    .line 73
    .line 74
    return-object p1

    .line 75
    :pswitch_16
    new-array p1, p1, [Ld2/b0;

    .line 76
    .line 77
    return-object p1

    .line 78
    :pswitch_17
    new-array p1, p1, [Ld2/s;

    .line 79
    .line 80
    return-object p1

    .line 81
    :pswitch_18
    new-array p1, p1, [Lcom/google/android/material/datepicker/q;

    .line 82
    .line 83
    return-object p1

    .line 84
    nop

    .line 85
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
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
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
