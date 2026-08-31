.class public final LT1/s;
.super LT1/q;
.source "SourceFile"


# instance fields
.field public final f:LT1/A;

.field public final g:Ljava/lang/String;

.field public final h:Ljava/util/ArrayList;


# direct methods
.method public constructor <init>(LT1/A;Ljava/lang/String;)V
    .locals 2

    .line 1
    const-string v0, "provider"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "startDestination"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-class v0, LT1/t;

    .line 12
    .line 13
    invoke-static {v0}, LC3/a;->z(Ljava/lang/Class;)Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-virtual {p1, v0}, LT1/A;->b(Ljava/lang/String;)LT1/z;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    const/4 v1, 0x0

    .line 22
    invoke-direct {p0, v0, v1}, LT1/q;-><init>(LT1/z;Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    new-instance v0, Ljava/util/ArrayList;

    .line 26
    .line 27
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 28
    .line 29
    .line 30
    iput-object v0, p0, LT1/s;->h:Ljava/util/ArrayList;

    .line 31
    .line 32
    iput-object p1, p0, LT1/s;->f:LT1/A;

    .line 33
    .line 34
    iput-object p2, p0, LT1/s;->g:Ljava/lang/String;

    .line 35
    .line 36
    return-void
.end method


# virtual methods
.method public final c()LT1/r;
    .locals 15

    .line 1
    invoke-super {p0}, LT1/q;->a()LT1/p;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, LT1/r;

    .line 6
    .line 7
    const-string v1, "nodes"

    .line 8
    .line 9
    iget-object v2, p0, LT1/s;->h:Ljava/util/ArrayList;

    .line 10
    .line 11
    invoke-static {v2, v1}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    iget-object v1, v0, LT1/r;->v:LD/u;

    .line 15
    .line 16
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 20
    .line 21
    .line 22
    move-result v3

    .line 23
    const/4 v4, 0x0

    .line 24
    move v5, v4

    .line 25
    :goto_0
    if-ge v5, v3, :cond_9

    .line 26
    .line 27
    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v6

    .line 31
    add-int/lit8 v5, v5, 0x1

    .line 32
    .line 33
    check-cast v6, LT1/p;

    .line 34
    .line 35
    if-nez v6, :cond_0

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_0
    iget-object v7, v1, LD/u;->d:Ljava/lang/Object;

    .line 39
    .line 40
    check-cast v7, Lr/S;

    .line 41
    .line 42
    iget-object v8, v1, LD/u;->c:Ljava/lang/Object;

    .line 43
    .line 44
    check-cast v8, LT1/r;

    .line 45
    .line 46
    iget-object v9, v8, LT1/p;->r:LW1/l;

    .line 47
    .line 48
    iget-object v10, v6, LT1/p;->r:LW1/l;

    .line 49
    .line 50
    iget v11, v10, LW1/l;->a:I

    .line 51
    .line 52
    iget-object v12, v10, LW1/l;->e:Ljava/lang/Object;

    .line 53
    .line 54
    check-cast v12, Ljava/lang/String;

    .line 55
    .line 56
    if-nez v11, :cond_2

    .line 57
    .line 58
    if-eqz v12, :cond_1

    .line 59
    .line 60
    goto :goto_1

    .line 61
    :cond_1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 62
    .line 63
    const-string v1, "Destinations must have an id or route. Call setId(), setRoute(), or include an android:id or app:route in your navigation XML."

    .line 64
    .line 65
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 66
    .line 67
    .line 68
    throw v0

    .line 69
    :cond_2
    :goto_1
    iget-object v13, v9, LW1/l;->e:Ljava/lang/Object;

    .line 70
    .line 71
    check-cast v13, Ljava/lang/String;

    .line 72
    .line 73
    const-string v14, "Destination "

    .line 74
    .line 75
    if-eqz v13, :cond_4

    .line 76
    .line 77
    invoke-static {v12, v13}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 78
    .line 79
    .line 80
    move-result v12

    .line 81
    if-nez v12, :cond_3

    .line 82
    .line 83
    goto :goto_2

    .line 84
    :cond_3
    new-instance v0, Ljava/lang/StringBuilder;

    .line 85
    .line 86
    invoke-direct {v0, v14}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 87
    .line 88
    .line 89
    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 90
    .line 91
    .line 92
    const-string v1, " cannot have the same route as graph "

    .line 93
    .line 94
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 95
    .line 96
    .line 97
    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 98
    .line 99
    .line 100
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 101
    .line 102
    .line 103
    move-result-object v0

    .line 104
    new-instance v1, Ljava/lang/IllegalArgumentException;

    .line 105
    .line 106
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 107
    .line 108
    .line 109
    move-result-object v0

    .line 110
    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 111
    .line 112
    .line 113
    throw v1

    .line 114
    :cond_4
    :goto_2
    iget v9, v9, LW1/l;->a:I

    .line 115
    .line 116
    if-eq v11, v9, :cond_8

    .line 117
    .line 118
    invoke-virtual {v7, v11}, Lr/S;->c(I)Ljava/lang/Object;

    .line 119
    .line 120
    .line 121
    move-result-object v9

    .line 122
    check-cast v9, LT1/p;

    .line 123
    .line 124
    if-ne v9, v6, :cond_5

    .line 125
    .line 126
    goto :goto_0

    .line 127
    :cond_5
    iget-object v11, v6, LT1/p;->s:LT1/r;

    .line 128
    .line 129
    if-nez v11, :cond_7

    .line 130
    .line 131
    if-eqz v9, :cond_6

    .line 132
    .line 133
    const/4 v11, 0x0

    .line 134
    iput-object v11, v9, LT1/p;->s:LT1/r;

    .line 135
    .line 136
    :cond_6
    iput-object v8, v6, LT1/p;->s:LT1/r;

    .line 137
    .line 138
    iget v8, v10, LW1/l;->a:I

    .line 139
    .line 140
    invoke-virtual {v7, v8, v6}, Lr/S;->e(ILjava/lang/Object;)V

    .line 141
    .line 142
    .line 143
    goto :goto_0

    .line 144
    :cond_7
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 145
    .line 146
    const-string v1, "Destination already has a parent set. Call NavGraph.remove() to remove the previous parent."

    .line 147
    .line 148
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 149
    .line 150
    .line 151
    throw v0

    .line 152
    :cond_8
    new-instance v0, Ljava/lang/StringBuilder;

    .line 153
    .line 154
    invoke-direct {v0, v14}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 155
    .line 156
    .line 157
    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 158
    .line 159
    .line 160
    const-string v1, " cannot have the same id as graph "

    .line 161
    .line 162
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 163
    .line 164
    .line 165
    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 166
    .line 167
    .line 168
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 169
    .line 170
    .line 171
    move-result-object v0

    .line 172
    new-instance v1, Ljava/lang/IllegalArgumentException;

    .line 173
    .line 174
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 175
    .line 176
    .line 177
    move-result-object v0

    .line 178
    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 179
    .line 180
    .line 181
    throw v1

    .line 182
    :cond_9
    iget-object v2, p0, LT1/s;->g:Ljava/lang/String;

    .line 183
    .line 184
    if-nez v2, :cond_b

    .line 185
    .line 186
    iget-object v0, p0, LT1/q;->b:Ljava/lang/String;

    .line 187
    .line 188
    if-eqz v0, :cond_a

    .line 189
    .line 190
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 191
    .line 192
    const-string v1, "You must set a start destination route"

    .line 193
    .line 194
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 195
    .line 196
    .line 197
    throw v0

    .line 198
    :cond_a
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 199
    .line 200
    const-string v1, "You must set a start destination id"

    .line 201
    .line 202
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 203
    .line 204
    .line 205
    throw v0

    .line 206
    :cond_b
    iget-object v3, v1, LD/u;->c:Ljava/lang/Object;

    .line 207
    .line 208
    check-cast v3, LT1/r;

    .line 209
    .line 210
    if-nez v2, :cond_c

    .line 211
    .line 212
    goto :goto_3

    .line 213
    :cond_c
    iget-object v4, v3, LT1/p;->r:LW1/l;

    .line 214
    .line 215
    iget-object v4, v4, LW1/l;->e:Ljava/lang/Object;

    .line 216
    .line 217
    check-cast v4, Ljava/lang/String;

    .line 218
    .line 219
    invoke-virtual {v2, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 220
    .line 221
    .line 222
    move-result v4

    .line 223
    if-nez v4, :cond_e

    .line 224
    .line 225
    invoke-static {v2}, LJ5/m;->U0(Ljava/lang/CharSequence;)Z

    .line 226
    .line 227
    .line 228
    move-result v3

    .line 229
    if-nez v3, :cond_d

    .line 230
    .line 231
    sget v3, LT1/p;->u:I

    .line 232
    .line 233
    const-string v3, "android-app://androidx.navigation/"

    .line 234
    .line 235
    invoke-virtual {v3, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 236
    .line 237
    .line 238
    move-result-object v3

    .line 239
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    .line 240
    .line 241
    .line 242
    move-result v4

    .line 243
    :goto_3
    iput v4, v1, LD/u;->b:I

    .line 244
    .line 245
    iput-object v2, v1, LD/u;->f:Ljava/lang/Object;

    .line 246
    .line 247
    return-object v0

    .line 248
    :cond_d
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 249
    .line 250
    const-string v1, "Cannot have an empty start destination route"

    .line 251
    .line 252
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 253
    .line 254
    .line 255
    throw v0

    .line 256
    :cond_e
    new-instance v0, Ljava/lang/StringBuilder;

    .line 257
    .line 258
    const-string v1, "Start destination "

    .line 259
    .line 260
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 261
    .line 262
    .line 263
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 264
    .line 265
    .line 266
    const-string v1, " cannot use the same route as the graph "

    .line 267
    .line 268
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 269
    .line 270
    .line 271
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 272
    .line 273
    .line 274
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 275
    .line 276
    .line 277
    move-result-object v0

    .line 278
    new-instance v1, Ljava/lang/IllegalArgumentException;

    .line 279
    .line 280
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 281
    .line 282
    .line 283
    move-result-object v0

    .line 284
    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 285
    .line 286
    .line 287
    throw v1
.end method
