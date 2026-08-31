.class public abstract LT1/q;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:LT1/z;

.field public final b:Ljava/lang/String;

.field public final c:Ljava/util/LinkedHashMap;

.field public final d:Ljava/util/ArrayList;

.field public final e:Ljava/util/LinkedHashMap;


# direct methods
.method public constructor <init>(LT1/z;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LT1/q;->a:LT1/z;

    .line 5
    .line 6
    iput-object p2, p0, LT1/q;->b:Ljava/lang/String;

    .line 7
    .line 8
    new-instance p1, Ljava/util/LinkedHashMap;

    .line 9
    .line 10
    invoke-direct {p1}, Ljava/util/LinkedHashMap;-><init>()V

    .line 11
    .line 12
    .line 13
    iput-object p1, p0, LT1/q;->c:Ljava/util/LinkedHashMap;

    .line 14
    .line 15
    new-instance p1, Ljava/util/ArrayList;

    .line 16
    .line 17
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 18
    .line 19
    .line 20
    iput-object p1, p0, LT1/q;->d:Ljava/util/ArrayList;

    .line 21
    .line 22
    new-instance p1, Ljava/util/LinkedHashMap;

    .line 23
    .line 24
    invoke-direct {p1}, Ljava/util/LinkedHashMap;-><init>()V

    .line 25
    .line 26
    .line 27
    iput-object p1, p0, LT1/q;->e:Ljava/util/LinkedHashMap;

    .line 28
    .line 29
    return-void
.end method


# virtual methods
.method public a()LT1/p;
    .locals 10

    .line 1
    invoke-virtual {p0}, LT1/q;->b()LT1/p;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    iget-object v1, v0, LT1/p;->r:LW1/l;

    .line 9
    .line 10
    iget-object v2, p0, LT1/q;->c:Ljava/util/LinkedHashMap;

    .line 11
    .line 12
    invoke-virtual {v2}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 21
    .line 22
    .line 23
    move-result v3

    .line 24
    const/4 v4, 0x0

    .line 25
    if-nez v3, :cond_7

    .line 26
    .line 27
    iget-object v2, p0, LT1/q;->d:Ljava/util/ArrayList;

    .line 28
    .line 29
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 30
    .line 31
    .line 32
    move-result v3

    .line 33
    const/4 v5, 0x0

    .line 34
    :goto_0
    if-ge v5, v3, :cond_1

    .line 35
    .line 36
    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v6

    .line 40
    add-int/lit8 v5, v5, 0x1

    .line 41
    .line 42
    check-cast v6, LT1/n;

    .line 43
    .line 44
    const-string v7, "navDeepLink"

    .line 45
    .line 46
    invoke-static {v6, v7}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 50
    .line 51
    .line 52
    iget-object v7, v1, LW1/l;->d:Ljava/lang/Object;

    .line 53
    .line 54
    check-cast v7, Ljava/util/LinkedHashMap;

    .line 55
    .line 56
    new-instance v8, LW1/k;

    .line 57
    .line 58
    const/4 v9, 0x0

    .line 59
    invoke-direct {v8, v6, v9}, LW1/k;-><init>(LT1/n;I)V

    .line 60
    .line 61
    .line 62
    invoke-static {v7, v8}, Lcom/google/android/gms/internal/measurement/n2;->B(Ljava/util/Map;LB5/c;)Ljava/util/ArrayList;

    .line 63
    .line 64
    .line 65
    move-result-object v7

    .line 66
    invoke-virtual {v7}, Ljava/util/ArrayList;->isEmpty()Z

    .line 67
    .line 68
    .line 69
    move-result v8

    .line 70
    if-eqz v8, :cond_0

    .line 71
    .line 72
    iget-object v7, v1, LW1/l;->c:Ljava/lang/Object;

    .line 73
    .line 74
    check-cast v7, Ljava/util/ArrayList;

    .line 75
    .line 76
    invoke-virtual {v7, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 77
    .line 78
    .line 79
    goto :goto_0

    .line 80
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 81
    .line 82
    const-string v2, "Deep link "

    .line 83
    .line 84
    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 85
    .line 86
    .line 87
    iget-object v2, v6, LT1/n;->a:Ljava/lang/String;

    .line 88
    .line 89
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 90
    .line 91
    .line 92
    const-string v2, " can\'t be used to open destination "

    .line 93
    .line 94
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 95
    .line 96
    .line 97
    iget-object v1, v1, LW1/l;->b:Ljava/lang/Object;

    .line 98
    .line 99
    check-cast v1, LT1/p;

    .line 100
    .line 101
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 102
    .line 103
    .line 104
    const-string v1, ".\nFollowing required arguments are missing: "

    .line 105
    .line 106
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 107
    .line 108
    .line 109
    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 110
    .line 111
    .line 112
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 113
    .line 114
    .line 115
    move-result-object v0

    .line 116
    new-instance v1, Ljava/lang/IllegalArgumentException;

    .line 117
    .line 118
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 119
    .line 120
    .line 121
    move-result-object v0

    .line 122
    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 123
    .line 124
    .line 125
    throw v1

    .line 126
    :cond_1
    iget-object v2, p0, LT1/q;->e:Ljava/util/LinkedHashMap;

    .line 127
    .line 128
    invoke-virtual {v2}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    .line 129
    .line 130
    .line 131
    move-result-object v2

    .line 132
    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 133
    .line 134
    .line 135
    move-result-object v2

    .line 136
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 137
    .line 138
    .line 139
    move-result v3

    .line 140
    if-nez v3, :cond_5

    .line 141
    .line 142
    iget-object v2, p0, LT1/q;->b:Ljava/lang/String;

    .line 143
    .line 144
    if-eqz v2, :cond_4

    .line 145
    .line 146
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 147
    .line 148
    .line 149
    invoke-static {v2}, LJ5/m;->U0(Ljava/lang/CharSequence;)Z

    .line 150
    .line 151
    .line 152
    move-result v3

    .line 153
    if-nez v3, :cond_3

    .line 154
    .line 155
    const-string v3, "android-app://androidx.navigation/"

    .line 156
    .line 157
    invoke-virtual {v3, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 158
    .line 159
    .line 160
    move-result-object v3

    .line 161
    const-string v4, "uriPattern"

    .line 162
    .line 163
    invoke-static {v3, v4}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 164
    .line 165
    .line 166
    new-instance v4, LT1/n;

    .line 167
    .line 168
    invoke-direct {v4, v3}, LT1/n;-><init>(Ljava/lang/String;)V

    .line 169
    .line 170
    .line 171
    iget-object v5, v1, LW1/l;->d:Ljava/lang/Object;

    .line 172
    .line 173
    check-cast v5, Ljava/util/LinkedHashMap;

    .line 174
    .line 175
    new-instance v6, LW1/k;

    .line 176
    .line 177
    const/4 v7, 0x1

    .line 178
    invoke-direct {v6, v4, v7}, LW1/k;-><init>(LT1/n;I)V

    .line 179
    .line 180
    .line 181
    invoke-static {v5, v6}, Lcom/google/android/gms/internal/measurement/n2;->B(Ljava/util/Map;LB5/c;)Ljava/util/ArrayList;

    .line 182
    .line 183
    .line 184
    move-result-object v4

    .line 185
    invoke-virtual {v4}, Ljava/util/ArrayList;->isEmpty()Z

    .line 186
    .line 187
    .line 188
    move-result v5

    .line 189
    if-eqz v5, :cond_2

    .line 190
    .line 191
    new-instance v4, LI2/d;

    .line 192
    .line 193
    const/16 v5, 0x8

    .line 194
    .line 195
    invoke-direct {v4, v5, v3}, LI2/d;-><init>(ILjava/lang/Object;)V

    .line 196
    .line 197
    .line 198
    invoke-static {v4}, Lm5/a;->d(LB5/a;)Lm5/o;

    .line 199
    .line 200
    .line 201
    move-result-object v4

    .line 202
    iput-object v4, v1, LW1/l;->f:Ljava/lang/Object;

    .line 203
    .line 204
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    .line 205
    .line 206
    .line 207
    move-result v3

    .line 208
    iput v3, v1, LW1/l;->a:I

    .line 209
    .line 210
    iput-object v2, v1, LW1/l;->e:Ljava/lang/Object;

    .line 211
    .line 212
    goto :goto_1

    .line 213
    :cond_2
    new-instance v0, Ljava/lang/StringBuilder;

    .line 214
    .line 215
    const-string v3, "Cannot set route \""

    .line 216
    .line 217
    invoke-direct {v0, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 218
    .line 219
    .line 220
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 221
    .line 222
    .line 223
    const-string v2, "\" for destination "

    .line 224
    .line 225
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 226
    .line 227
    .line 228
    iget-object v1, v1, LW1/l;->b:Ljava/lang/Object;

    .line 229
    .line 230
    check-cast v1, LT1/p;

    .line 231
    .line 232
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 233
    .line 234
    .line 235
    const-string v1, ". Following required arguments are missing: "

    .line 236
    .line 237
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 238
    .line 239
    .line 240
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 241
    .line 242
    .line 243
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 244
    .line 245
    .line 246
    move-result-object v0

    .line 247
    new-instance v1, Ljava/lang/IllegalArgumentException;

    .line 248
    .line 249
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 250
    .line 251
    .line 252
    move-result-object v0

    .line 253
    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 254
    .line 255
    .line 256
    throw v1

    .line 257
    :cond_3
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 258
    .line 259
    const-string v1, "Cannot have an empty route"

    .line 260
    .line 261
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 262
    .line 263
    .line 264
    throw v0

    .line 265
    :cond_4
    :goto_1
    return-object v0

    .line 266
    :cond_5
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 267
    .line 268
    .line 269
    move-result-object v0

    .line 270
    check-cast v0, Ljava/util/Map$Entry;

    .line 271
    .line 272
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 273
    .line 274
    .line 275
    move-result-object v1

    .line 276
    check-cast v1, Ljava/lang/Number;

    .line 277
    .line 278
    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    .line 279
    .line 280
    .line 281
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 282
    .line 283
    .line 284
    move-result-object v0

    .line 285
    if-nez v0, :cond_6

    .line 286
    .line 287
    const-string v0, "action"

    .line 288
    .line 289
    invoke-static {v4, v0}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 290
    .line 291
    .line 292
    throw v4

    .line 293
    :cond_6
    new-instance v0, Ljava/lang/ClassCastException;

    .line 294
    .line 295
    invoke-direct {v0}, Ljava/lang/ClassCastException;-><init>()V

    .line 296
    .line 297
    .line 298
    throw v0

    .line 299
    :cond_7
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 300
    .line 301
    .line 302
    move-result-object v0

    .line 303
    check-cast v0, Ljava/util/Map$Entry;

    .line 304
    .line 305
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 306
    .line 307
    .line 308
    move-result-object v1

    .line 309
    check-cast v1, Ljava/lang/String;

    .line 310
    .line 311
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 312
    .line 313
    .line 314
    move-result-object v0

    .line 315
    if-nez v0, :cond_8

    .line 316
    .line 317
    const-string v0, "argumentName"

    .line 318
    .line 319
    invoke-static {v1, v0}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 320
    .line 321
    .line 322
    const-string v0, "argument"

    .line 323
    .line 324
    invoke-static {v4, v0}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 325
    .line 326
    .line 327
    throw v4

    .line 328
    :cond_8
    new-instance v0, Ljava/lang/ClassCastException;

    .line 329
    .line 330
    invoke-direct {v0}, Ljava/lang/ClassCastException;-><init>()V

    .line 331
    .line 332
    .line 333
    throw v0
.end method

.method public b()LT1/p;
    .locals 1

    .line 1
    iget-object v0, p0, LT1/q;->a:LT1/z;

    .line 2
    .line 3
    invoke-virtual {v0}, LT1/z;->a()LT1/p;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method
