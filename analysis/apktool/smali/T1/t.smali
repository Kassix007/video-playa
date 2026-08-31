.class public LT1/t;
.super LT1/z;
.source "SourceFile"


# annotations
.annotation runtime LT1/y;
    value = "navigation"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "LT1/z;"
    }
.end annotation


# instance fields
.field public final c:LT1/A;


# direct methods
.method public constructor <init>(LT1/A;)V
    .locals 1

    .line 1
    const-string v0, "navigatorProvider"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, LT1/t;->c:LT1/A;

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public bridge synthetic a()LT1/p;
    .locals 1

    .line 1
    invoke-virtual {p0}, LT1/t;->g()LT1/r;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public final d(Ljava/util/List;LT1/w;)V
    .locals 6

    .line 1
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_c

    .line 10
    .line 11
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    check-cast v0, LT1/d;

    .line 16
    .line 17
    iget-object v1, v0, LT1/d;->r:LT1/p;

    .line 18
    .line 19
    const-string v2, "null cannot be cast to non-null type androidx.navigation.NavGraph"

    .line 20
    .line 21
    invoke-static {v1, v2}, Lkotlin/jvm/internal/m;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    check-cast v1, LT1/r;

    .line 25
    .line 26
    iget-object v2, v1, LT1/p;->r:LW1/l;

    .line 27
    .line 28
    new-instance v3, Lkotlin/jvm/internal/y;

    .line 29
    .line 30
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 31
    .line 32
    .line 33
    iget-object v0, v0, LT1/d;->x:LW1/c;

    .line 34
    .line 35
    invoke-virtual {v0}, LW1/c;->a()Landroid/os/Bundle;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    iput-object v0, v3, Lkotlin/jvm/internal/y;->q:Ljava/lang/Object;

    .line 40
    .line 41
    iget-object v0, v1, LT1/r;->v:LD/u;

    .line 42
    .line 43
    iget v1, v0, LD/u;->b:I

    .line 44
    .line 45
    iget-object v4, v0, LD/u;->f:Ljava/lang/Object;

    .line 46
    .line 47
    check-cast v4, Ljava/lang/String;

    .line 48
    .line 49
    if-nez v1, :cond_2

    .line 50
    .line 51
    if-eqz v4, :cond_0

    .line 52
    .line 53
    goto :goto_2

    .line 54
    :cond_0
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 55
    .line 56
    .line 57
    iget p1, v2, LW1/l;->a:I

    .line 58
    .line 59
    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    const-string p2, "superName"

    .line 64
    .line 65
    invoke-static {p1, p2}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 66
    .line 67
    .line 68
    iget-object p2, v0, LD/u;->c:Ljava/lang/Object;

    .line 69
    .line 70
    check-cast p2, LT1/r;

    .line 71
    .line 72
    iget-object p2, p2, LT1/p;->r:LW1/l;

    .line 73
    .line 74
    iget p2, p2, LW1/l;->a:I

    .line 75
    .line 76
    if-eqz p2, :cond_1

    .line 77
    .line 78
    goto :goto_1

    .line 79
    :cond_1
    const-string p1, "the root navigation"

    .line 80
    .line 81
    :goto_1
    const-string p2, "no start destination defined via app:startDestination for "

    .line 82
    .line 83
    invoke-virtual {p2, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object p1

    .line 87
    new-instance p2, Ljava/lang/IllegalStateException;

    .line 88
    .line 89
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 90
    .line 91
    .line 92
    move-result-object p1

    .line 93
    invoke-direct {p2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 94
    .line 95
    .line 96
    throw p2

    .line 97
    :cond_2
    :goto_2
    const/4 v2, 0x0

    .line 98
    if-eqz v4, :cond_3

    .line 99
    .line 100
    invoke-virtual {v0, v4, v2}, LD/u;->o(Ljava/lang/String;Z)LT1/p;

    .line 101
    .line 102
    .line 103
    move-result-object v1

    .line 104
    goto :goto_3

    .line 105
    :cond_3
    iget-object v5, v0, LD/u;->d:Ljava/lang/Object;

    .line 106
    .line 107
    check-cast v5, Lr/S;

    .line 108
    .line 109
    invoke-virtual {v5, v1}, Lr/S;->c(I)Ljava/lang/Object;

    .line 110
    .line 111
    .line 112
    move-result-object v1

    .line 113
    check-cast v1, LT1/p;

    .line 114
    .line 115
    :goto_3
    if-nez v1, :cond_6

    .line 116
    .line 117
    iget-object p1, v0, LD/u;->e:Ljava/io/Serializable;

    .line 118
    .line 119
    check-cast p1, Ljava/lang/String;

    .line 120
    .line 121
    if-nez p1, :cond_5

    .line 122
    .line 123
    iget-object p1, v0, LD/u;->f:Ljava/lang/Object;

    .line 124
    .line 125
    check-cast p1, Ljava/lang/String;

    .line 126
    .line 127
    if-nez p1, :cond_4

    .line 128
    .line 129
    iget p1, v0, LD/u;->b:I

    .line 130
    .line 131
    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 132
    .line 133
    .line 134
    move-result-object p1

    .line 135
    :cond_4
    iput-object p1, v0, LD/u;->e:Ljava/io/Serializable;

    .line 136
    .line 137
    :cond_5
    iget-object p1, v0, LD/u;->e:Ljava/io/Serializable;

    .line 138
    .line 139
    check-cast p1, Ljava/lang/String;

    .line 140
    .line 141
    invoke-static {p1}, Lkotlin/jvm/internal/m;->b(Ljava/lang/Object;)V

    .line 142
    .line 143
    .line 144
    new-instance p2, Ljava/lang/IllegalArgumentException;

    .line 145
    .line 146
    const-string v0, "navigation destination "

    .line 147
    .line 148
    const-string v1, " is not a direct child of this NavGraph"

    .line 149
    .line 150
    invoke-static {v0, p1, v1}, LC0/S;->n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 151
    .line 152
    .line 153
    move-result-object p1

    .line 154
    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 155
    .line 156
    .line 157
    throw p2

    .line 158
    :cond_6
    iget-object v0, v1, LT1/p;->r:LW1/l;

    .line 159
    .line 160
    if-eqz v4, :cond_b

    .line 161
    .line 162
    iget-object v5, v0, LW1/l;->e:Ljava/lang/Object;

    .line 163
    .line 164
    check-cast v5, Ljava/lang/String;

    .line 165
    .line 166
    invoke-virtual {v4, v5}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 167
    .line 168
    .line 169
    move-result v5

    .line 170
    if-nez v5, :cond_9

    .line 171
    .line 172
    invoke-virtual {v0, v4}, LW1/l;->f(Ljava/lang/String;)LT1/o;

    .line 173
    .line 174
    .line 175
    move-result-object v0

    .line 176
    if-eqz v0, :cond_7

    .line 177
    .line 178
    iget-object v0, v0, LT1/o;->r:Landroid/os/Bundle;

    .line 179
    .line 180
    goto :goto_4

    .line 181
    :cond_7
    const/4 v0, 0x0

    .line 182
    :goto_4
    if-eqz v0, :cond_9

    .line 183
    .line 184
    invoke-virtual {v0}, Landroid/os/BaseBundle;->isEmpty()Z

    .line 185
    .line 186
    .line 187
    move-result v4

    .line 188
    if-nez v4, :cond_9

    .line 189
    .line 190
    new-array v4, v2, [Lm5/j;

    .line 191
    .line 192
    invoke-static {v4, v2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 193
    .line 194
    .line 195
    move-result-object v2

    .line 196
    check-cast v2, [Lm5/j;

    .line 197
    .line 198
    invoke-static {v2}, Lcom/google/android/gms/internal/measurement/P1;->g([Lm5/j;)Landroid/os/Bundle;

    .line 199
    .line 200
    .line 201
    move-result-object v2

    .line 202
    invoke-virtual {v2, v0}, Landroid/os/Bundle;->putAll(Landroid/os/Bundle;)V

    .line 203
    .line 204
    .line 205
    iget-object v0, v3, Lkotlin/jvm/internal/y;->q:Ljava/lang/Object;

    .line 206
    .line 207
    check-cast v0, Landroid/os/Bundle;

    .line 208
    .line 209
    if-eqz v0, :cond_8

    .line 210
    .line 211
    invoke-virtual {v2, v0}, Landroid/os/Bundle;->putAll(Landroid/os/Bundle;)V

    .line 212
    .line 213
    .line 214
    :cond_8
    iput-object v2, v3, Lkotlin/jvm/internal/y;->q:Ljava/lang/Object;

    .line 215
    .line 216
    :cond_9
    invoke-virtual {v1}, LT1/p;->g()Ljava/util/Map;

    .line 217
    .line 218
    .line 219
    move-result-object v0

    .line 220
    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    .line 221
    .line 222
    .line 223
    move-result v0

    .line 224
    if-nez v0, :cond_b

    .line 225
    .line 226
    invoke-virtual {v1}, LT1/p;->g()Ljava/util/Map;

    .line 227
    .line 228
    .line 229
    move-result-object v0

    .line 230
    new-instance v2, LJ5/i;

    .line 231
    .line 232
    const/4 v4, 0x3

    .line 233
    invoke-direct {v2, v4, v3}, LJ5/i;-><init>(ILjava/lang/Object;)V

    .line 234
    .line 235
    .line 236
    invoke-static {v0, v2}, Lcom/google/android/gms/internal/measurement/n2;->B(Ljava/util/Map;LB5/c;)Ljava/util/ArrayList;

    .line 237
    .line 238
    .line 239
    move-result-object v0

    .line 240
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 241
    .line 242
    .line 243
    move-result v2

    .line 244
    if-eqz v2, :cond_a

    .line 245
    .line 246
    goto :goto_5

    .line 247
    :cond_a
    new-instance p1, Ljava/lang/StringBuilder;

    .line 248
    .line 249
    const-string p2, "Cannot navigate to startDestination "

    .line 250
    .line 251
    invoke-direct {p1, p2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 252
    .line 253
    .line 254
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 255
    .line 256
    .line 257
    const-string p2, ". Missing required arguments ["

    .line 258
    .line 259
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 260
    .line 261
    .line 262
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 263
    .line 264
    .line 265
    const/16 p2, 0x5d

    .line 266
    .line 267
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 268
    .line 269
    .line 270
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 271
    .line 272
    .line 273
    move-result-object p1

    .line 274
    new-instance p2, Ljava/lang/IllegalArgumentException;

    .line 275
    .line 276
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 277
    .line 278
    .line 279
    move-result-object p1

    .line 280
    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 281
    .line 282
    .line 283
    throw p2

    .line 284
    :cond_b
    :goto_5
    iget-object v0, p0, LT1/t;->c:LT1/A;

    .line 285
    .line 286
    iget-object v2, v1, LT1/p;->q:Ljava/lang/String;

    .line 287
    .line 288
    invoke-virtual {v0, v2}, LT1/A;->b(Ljava/lang/String;)LT1/z;

    .line 289
    .line 290
    .line 291
    move-result-object v0

    .line 292
    invoke-virtual {p0}, LT1/z;->b()LT1/h;

    .line 293
    .line 294
    .line 295
    move-result-object v2

    .line 296
    iget-object v3, v3, Lkotlin/jvm/internal/y;->q:Ljava/lang/Object;

    .line 297
    .line 298
    check-cast v3, Landroid/os/Bundle;

    .line 299
    .line 300
    invoke-virtual {v1, v3}, LT1/p;->d(Landroid/os/Bundle;)Landroid/os/Bundle;

    .line 301
    .line 302
    .line 303
    move-result-object v3

    .line 304
    invoke-virtual {v2, v1, v3}, LT1/h;->b(LT1/p;Landroid/os/Bundle;)LT1/d;

    .line 305
    .line 306
    .line 307
    move-result-object v1

    .line 308
    invoke-static {v1}, Lcom/google/android/gms/internal/measurement/n2;->z(Ljava/lang/Object;)Ljava/util/List;

    .line 309
    .line 310
    .line 311
    move-result-object v1

    .line 312
    invoke-virtual {v0, v1, p2}, LT1/z;->d(Ljava/util/List;LT1/w;)V

    .line 313
    .line 314
    .line 315
    goto/16 :goto_0

    .line 316
    .line 317
    :cond_c
    return-void
.end method

.method public g()LT1/r;
    .locals 1

    .line 1
    new-instance v0, LT1/r;

    .line 2
    .line 3
    invoke-direct {v0, p0}, LT1/r;-><init>(LT1/t;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method
