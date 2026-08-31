.class public final synthetic LI2/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LB5/a;


# instance fields
.field public final synthetic q:I

.field public final synthetic r:Ljava/lang/Object;

.field public final synthetic s:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, LI2/e;->q:I

    iput-object p2, p0, LI2/e;->r:Ljava/lang/Object;

    iput-object p3, p0, LI2/e;->s:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 11

    .line 1
    iget v0, p0, LI2/e;->q:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LI2/e;->r:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Lg5/h;

    .line 9
    .line 10
    iget-object v1, p0, LI2/e;->s:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v1, Ljava/lang/String;

    .line 13
    .line 14
    invoke-virtual {v0, v1}, Lg5/h;->c(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    sget-object v0, Lm5/y;->a:Lm5/y;

    .line 18
    .line 19
    return-object v0

    .line 20
    :pswitch_0
    iget-object v0, p0, LI2/e;->r:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast v0, LB5/c;

    .line 23
    .line 24
    iget-object v1, p0, LI2/e;->s:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast v1, LR4/x;

    .line 27
    .line 28
    iget-object v1, v1, LR4/x;->g:Ljava/lang/String;

    .line 29
    .line 30
    invoke-interface {v0, v1}, LB5/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    sget-object v0, Lm5/y;->a:Lm5/y;

    .line 34
    .line 35
    return-object v0

    .line 36
    :pswitch_1
    iget-object v0, p0, LI2/e;->r:Ljava/lang/Object;

    .line 37
    .line 38
    check-cast v0, LX5/f;

    .line 39
    .line 40
    iget-object v1, p0, LI2/e;->s:Ljava/lang/Object;

    .line 41
    .line 42
    check-cast v1, La6/c;

    .line 43
    .line 44
    new-instance v2, Ljava/util/LinkedHashMap;

    .line 45
    .line 46
    invoke-direct {v2}, Ljava/util/LinkedHashMap;-><init>()V

    .line 47
    .line 48
    .line 49
    iget-object v3, v1, La6/c;->a:La6/j;

    .line 50
    .line 51
    invoke-static {v0, v1}, Lb6/e;->h(LX5/f;La6/c;)V

    .line 52
    .line 53
    .line 54
    invoke-interface {v0}, LX5/f;->d()I

    .line 55
    .line 56
    .line 57
    move-result v1

    .line 58
    const/4 v3, 0x0

    .line 59
    move v4, v3

    .line 60
    :goto_0
    if-ge v4, v1, :cond_6

    .line 61
    .line 62
    invoke-interface {v0, v4}, LX5/f;->h(I)Ljava/util/List;

    .line 63
    .line 64
    .line 65
    move-result-object v5

    .line 66
    check-cast v5, Ljava/lang/Iterable;

    .line 67
    .line 68
    new-instance v6, Ljava/util/ArrayList;

    .line 69
    .line 70
    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 71
    .line 72
    .line 73
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 74
    .line 75
    .line 76
    move-result-object v5

    .line 77
    :cond_0
    :goto_1
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 78
    .line 79
    .line 80
    move-result v7

    .line 81
    if-eqz v7, :cond_1

    .line 82
    .line 83
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object v7

    .line 87
    instance-of v8, v7, La6/t;

    .line 88
    .line 89
    if-eqz v8, :cond_0

    .line 90
    .line 91
    invoke-virtual {v6, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 92
    .line 93
    .line 94
    goto :goto_1

    .line 95
    :cond_1
    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    .line 96
    .line 97
    .line 98
    move-result v5

    .line 99
    const/4 v7, 0x1

    .line 100
    if-ne v5, v7, :cond_2

    .line 101
    .line 102
    invoke-virtual {v6, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    move-result-object v5

    .line 106
    goto :goto_2

    .line 107
    :cond_2
    const/4 v5, 0x0

    .line 108
    :goto_2
    check-cast v5, La6/t;

    .line 109
    .line 110
    if-eqz v5, :cond_5

    .line 111
    .line 112
    invoke-interface {v5}, La6/t;->names()[Ljava/lang/String;

    .line 113
    .line 114
    .line 115
    move-result-object v5

    .line 116
    if-eqz v5, :cond_5

    .line 117
    .line 118
    array-length v6, v5

    .line 119
    move v7, v3

    .line 120
    :goto_3
    if-ge v7, v6, :cond_5

    .line 121
    .line 122
    aget-object v8, v5, v7

    .line 123
    .line 124
    invoke-interface {v0}, LX5/f;->c()Lcom/google/android/gms/internal/measurement/I1;

    .line 125
    .line 126
    .line 127
    move-result-object v9

    .line 128
    sget-object v10, LX5/h;->d:LX5/h;

    .line 129
    .line 130
    invoke-static {v9, v10}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 131
    .line 132
    .line 133
    move-result v9

    .line 134
    if-eqz v9, :cond_3

    .line 135
    .line 136
    const-string v9, "enum value"

    .line 137
    .line 138
    goto :goto_4

    .line 139
    :cond_3
    const-string v9, "property"

    .line 140
    .line 141
    :goto_4
    invoke-interface {v2, v8}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 142
    .line 143
    .line 144
    move-result v10

    .line 145
    if-nez v10, :cond_4

    .line 146
    .line 147
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 148
    .line 149
    .line 150
    move-result-object v9

    .line 151
    invoke-interface {v2, v8, v9}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 152
    .line 153
    .line 154
    add-int/lit8 v7, v7, 0x1

    .line 155
    .line 156
    goto :goto_3

    .line 157
    :cond_4
    new-instance v1, LV5/e;

    .line 158
    .line 159
    new-instance v3, Ljava/lang/StringBuilder;

    .line 160
    .line 161
    const-string v5, "The suggested name \'"

    .line 162
    .line 163
    invoke-direct {v3, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 164
    .line 165
    .line 166
    invoke-virtual {v3, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 167
    .line 168
    .line 169
    const-string v5, "\' for "

    .line 170
    .line 171
    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 172
    .line 173
    .line 174
    invoke-virtual {v3, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 175
    .line 176
    .line 177
    const/16 v5, 0x20

    .line 178
    .line 179
    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 180
    .line 181
    .line 182
    invoke-interface {v0, v4}, LX5/f;->e(I)Ljava/lang/String;

    .line 183
    .line 184
    .line 185
    move-result-object v4

    .line 186
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 187
    .line 188
    .line 189
    const-string v4, " is already one of the names for "

    .line 190
    .line 191
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 192
    .line 193
    .line 194
    invoke-virtual {v3, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 195
    .line 196
    .line 197
    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 198
    .line 199
    .line 200
    invoke-static {v8, v2}, Ln5/x;->J(Ljava/lang/Object;Ljava/util/Map;)Ljava/lang/Object;

    .line 201
    .line 202
    .line 203
    move-result-object v2

    .line 204
    check-cast v2, Ljava/lang/Number;

    .line 205
    .line 206
    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    .line 207
    .line 208
    .line 209
    move-result v2

    .line 210
    invoke-interface {v0, v2}, LX5/f;->e(I)Ljava/lang/String;

    .line 211
    .line 212
    .line 213
    move-result-object v2

    .line 214
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 215
    .line 216
    .line 217
    const-string v2, " in "

    .line 218
    .line 219
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 220
    .line 221
    .line 222
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 223
    .line 224
    .line 225
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 226
    .line 227
    .line 228
    move-result-object v0

    .line 229
    const-string v2, "message"

    .line 230
    .line 231
    invoke-static {v0, v2}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 232
    .line 233
    .line 234
    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 235
    .line 236
    .line 237
    throw v1

    .line 238
    :cond_5
    add-int/lit8 v4, v4, 0x1

    .line 239
    .line 240
    goto/16 :goto_0

    .line 241
    .line 242
    :cond_6
    invoke-interface {v2}, Ljava/util/Map;->isEmpty()Z

    .line 243
    .line 244
    .line 245
    move-result v0

    .line 246
    if-eqz v0, :cond_7

    .line 247
    .line 248
    sget-object v2, Ln5/t;->q:Ln5/t;

    .line 249
    .line 250
    :cond_7
    return-object v2

    .line 251
    :pswitch_2
    iget-object v0, p0, LI2/e;->r:Ljava/lang/Object;

    .line 252
    .line 253
    check-cast v0, LB5/a;

    .line 254
    .line 255
    iget-object v1, p0, LI2/e;->s:Ljava/lang/Object;

    .line 256
    .line 257
    check-cast v1, LP/W;

    .line 258
    .line 259
    invoke-interface {v0}, LB5/a;->invoke()Ljava/lang/Object;

    .line 260
    .line 261
    .line 262
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 263
    .line 264
    invoke-interface {v1, v0}, LP/W;->setValue(Ljava/lang/Object;)V

    .line 265
    .line 266
    .line 267
    sget-object v0, Lm5/y;->a:Lm5/y;

    .line 268
    .line 269
    return-object v0

    .line 270
    :pswitch_3
    iget-object v0, p0, LI2/e;->r:Ljava/lang/Object;

    .line 271
    .line 272
    check-cast v0, LU1/r;

    .line 273
    .line 274
    iget-object v1, p0, LI2/e;->s:Ljava/lang/Object;

    .line 275
    .line 276
    check-cast v1, LT1/d;

    .line 277
    .line 278
    const/4 v2, 0x0

    .line 279
    invoke-virtual {v0, v1, v2}, LU1/r;->e(LT1/d;Z)V

    .line 280
    .line 281
    .line 282
    sget-object v0, Lm5/y;->a:Lm5/y;

    .line 283
    .line 284
    return-object v0

    .line 285
    :pswitch_4
    iget-object v0, p0, LI2/e;->r:Ljava/lang/Object;

    .line 286
    .line 287
    check-cast v0, LR4/A;

    .line 288
    .line 289
    iget-object v1, p0, LI2/e;->s:Ljava/lang/Object;

    .line 290
    .line 291
    check-cast v1, LR4/k1;

    .line 292
    .line 293
    iget-object v0, v0, LR4/A;->e:Ljava/lang/String;

    .line 294
    .line 295
    if-eqz v0, :cond_8

    .line 296
    .line 297
    invoke-static {v1, v0}, LC3/a;->C(LR4/k1;Ljava/lang/String;)Z

    .line 298
    .line 299
    .line 300
    move-result v2

    .line 301
    if-eqz v2, :cond_8

    .line 302
    .line 303
    iget-object v1, v1, LR4/k1;->k:Landroid/webkit/WebView;

    .line 304
    .line 305
    if-eqz v1, :cond_8

    .line 306
    .line 307
    invoke-virtual {v1, v0}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V

    .line 308
    .line 309
    .line 310
    :cond_8
    sget-object v0, Lm5/y;->a:Lm5/y;

    .line 311
    .line 312
    return-object v0

    .line 313
    :pswitch_5
    iget-object v0, p0, LI2/e;->r:Ljava/lang/Object;

    .line 314
    .line 315
    check-cast v0, LL2/f;

    .line 316
    .line 317
    iget-object v1, p0, LI2/e;->s:Ljava/lang/Object;

    .line 318
    .line 319
    check-cast v1, Lkotlin/jvm/internal/f;

    .line 320
    .line 321
    new-instance v2, Lm5/j;

    .line 322
    .line 323
    invoke-direct {v2, v0, v1}, Lm5/j;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 324
    .line 325
    .line 326
    invoke-static {v2}, Lcom/google/android/gms/internal/measurement/n2;->z(Ljava/lang/Object;)Ljava/util/List;

    .line 327
    .line 328
    .line 329
    move-result-object v0

    .line 330
    return-object v0

    .line 331
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
