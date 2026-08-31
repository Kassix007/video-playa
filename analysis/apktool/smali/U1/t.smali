.class public final synthetic LU1/t;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LB5/c;


# instance fields
.field public final synthetic q:I

.field public final synthetic r:LU1/i;

.field public final synthetic s:LB5/c;

.field public final synthetic t:LB5/c;

.field public final synthetic u:LP/W;


# direct methods
.method public synthetic constructor <init>(LU1/i;LB5/c;LB5/c;LP/W;I)V
    .locals 0

    .line 1
    iput p5, p0, LU1/t;->q:I

    iput-object p1, p0, LU1/t;->r:LU1/i;

    iput-object p2, p0, LU1/t;->s:LB5/c;

    iput-object p3, p0, LU1/t;->t:LB5/c;

    iput-object p4, p0, LU1/t;->u:LP/W;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    iget v0, p0, LU1/t;->q:I

    .line 2
    .line 3
    const-string v1, "null cannot be cast to non-null type androidx.navigation.compose.ComposeNavigator.Destination"

    .line 4
    .line 5
    iget-object v2, p0, LU1/t;->u:LP/W;

    .line 6
    .line 7
    iget-object v3, p0, LU1/t;->t:LB5/c;

    .line 8
    .line 9
    iget-object v4, p0, LU1/t;->s:LB5/c;

    .line 10
    .line 11
    iget-object v5, p0, LU1/t;->r:LU1/i;

    .line 12
    .line 13
    check-cast p1, Lt/l;

    .line 14
    .line 15
    packed-switch v0, :pswitch_data_0

    .line 16
    .line 17
    .line 18
    invoke-virtual {p1}, Lt/l;->c()Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    check-cast v0, LT1/d;

    .line 23
    .line 24
    iget-object v0, v0, LT1/d;->r:LT1/p;

    .line 25
    .line 26
    invoke-static {v0, v1}, Lkotlin/jvm/internal/m;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    check-cast v0, LU1/h;

    .line 30
    .line 31
    iget-object v1, v5, LU1/i;->c:LP/f0;

    .line 32
    .line 33
    invoke-virtual {v1}, LP/f0;->getValue()Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    check-cast v1, Ljava/lang/Boolean;

    .line 38
    .line 39
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 40
    .line 41
    .line 42
    move-result v1

    .line 43
    if-nez v1, :cond_4

    .line 44
    .line 45
    invoke-interface {v2}, LP/S0;->getValue()Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    check-cast v1, Ljava/lang/Boolean;

    .line 50
    .line 51
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 52
    .line 53
    .line 54
    move-result v1

    .line 55
    if-eqz v1, :cond_0

    .line 56
    .line 57
    goto :goto_1

    .line 58
    :cond_0
    sget v1, LT1/p;->u:I

    .line 59
    .line 60
    invoke-static {v0}, Ln5/A;->u(LT1/p;)LI5/i;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    invoke-interface {v0}, LI5/i;->iterator()Ljava/util/Iterator;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 69
    .line 70
    .line 71
    move-result v1

    .line 72
    if-eqz v1, :cond_3

    .line 73
    .line 74
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object v1

    .line 78
    check-cast v1, LT1/p;

    .line 79
    .line 80
    instance-of v2, v1, LU1/h;

    .line 81
    .line 82
    if-eqz v2, :cond_2

    .line 83
    .line 84
    check-cast v1, LU1/h;

    .line 85
    .line 86
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 87
    .line 88
    .line 89
    goto :goto_0

    .line 90
    :cond_2
    instance-of v2, v1, LU1/f;

    .line 91
    .line 92
    if-eqz v2, :cond_1

    .line 93
    .line 94
    check-cast v1, LU1/f;

    .line 95
    .line 96
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 97
    .line 98
    .line 99
    goto :goto_0

    .line 100
    :cond_3
    invoke-interface {v3, p1}, LB5/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 101
    .line 102
    .line 103
    move-result-object p1

    .line 104
    check-cast p1, Lt/D;

    .line 105
    .line 106
    goto :goto_3

    .line 107
    :cond_4
    :goto_1
    sget v1, LT1/p;->u:I

    .line 108
    .line 109
    invoke-static {v0}, Ln5/A;->u(LT1/p;)LI5/i;

    .line 110
    .line 111
    .line 112
    move-result-object v0

    .line 113
    invoke-interface {v0}, LI5/i;->iterator()Ljava/util/Iterator;

    .line 114
    .line 115
    .line 116
    move-result-object v0

    .line 117
    :cond_5
    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 118
    .line 119
    .line 120
    move-result v1

    .line 121
    if-eqz v1, :cond_7

    .line 122
    .line 123
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 124
    .line 125
    .line 126
    move-result-object v1

    .line 127
    check-cast v1, LT1/p;

    .line 128
    .line 129
    instance-of v2, v1, LU1/h;

    .line 130
    .line 131
    if-eqz v2, :cond_6

    .line 132
    .line 133
    check-cast v1, LU1/h;

    .line 134
    .line 135
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 136
    .line 137
    .line 138
    goto :goto_2

    .line 139
    :cond_6
    instance-of v2, v1, LU1/f;

    .line 140
    .line 141
    if-eqz v2, :cond_5

    .line 142
    .line 143
    check-cast v1, LU1/f;

    .line 144
    .line 145
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 146
    .line 147
    .line 148
    goto :goto_2

    .line 149
    :cond_7
    invoke-interface {v4, p1}, LB5/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 150
    .line 151
    .line 152
    move-result-object p1

    .line 153
    check-cast p1, Lt/D;

    .line 154
    .line 155
    :goto_3
    return-object p1

    .line 156
    :pswitch_0
    invoke-virtual {p1}, Lt/l;->a()Ljava/lang/Object;

    .line 157
    .line 158
    .line 159
    move-result-object v0

    .line 160
    check-cast v0, LT1/d;

    .line 161
    .line 162
    iget-object v0, v0, LT1/d;->r:LT1/p;

    .line 163
    .line 164
    invoke-static {v0, v1}, Lkotlin/jvm/internal/m;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 165
    .line 166
    .line 167
    check-cast v0, LU1/h;

    .line 168
    .line 169
    iget-object v1, v5, LU1/i;->c:LP/f0;

    .line 170
    .line 171
    invoke-virtual {v1}, LP/f0;->getValue()Ljava/lang/Object;

    .line 172
    .line 173
    .line 174
    move-result-object v1

    .line 175
    check-cast v1, Ljava/lang/Boolean;

    .line 176
    .line 177
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 178
    .line 179
    .line 180
    move-result v1

    .line 181
    if-nez v1, :cond_c

    .line 182
    .line 183
    invoke-interface {v2}, LP/S0;->getValue()Ljava/lang/Object;

    .line 184
    .line 185
    .line 186
    move-result-object v1

    .line 187
    check-cast v1, Ljava/lang/Boolean;

    .line 188
    .line 189
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 190
    .line 191
    .line 192
    move-result v1

    .line 193
    if-eqz v1, :cond_8

    .line 194
    .line 195
    goto :goto_5

    .line 196
    :cond_8
    sget v1, LT1/p;->u:I

    .line 197
    .line 198
    invoke-static {v0}, Ln5/A;->u(LT1/p;)LI5/i;

    .line 199
    .line 200
    .line 201
    move-result-object v0

    .line 202
    invoke-interface {v0}, LI5/i;->iterator()Ljava/util/Iterator;

    .line 203
    .line 204
    .line 205
    move-result-object v0

    .line 206
    :cond_9
    :goto_4
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 207
    .line 208
    .line 209
    move-result v1

    .line 210
    if-eqz v1, :cond_b

    .line 211
    .line 212
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 213
    .line 214
    .line 215
    move-result-object v1

    .line 216
    check-cast v1, LT1/p;

    .line 217
    .line 218
    instance-of v2, v1, LU1/h;

    .line 219
    .line 220
    if-eqz v2, :cond_a

    .line 221
    .line 222
    check-cast v1, LU1/h;

    .line 223
    .line 224
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 225
    .line 226
    .line 227
    goto :goto_4

    .line 228
    :cond_a
    instance-of v2, v1, LU1/f;

    .line 229
    .line 230
    if-eqz v2, :cond_9

    .line 231
    .line 232
    check-cast v1, LU1/f;

    .line 233
    .line 234
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 235
    .line 236
    .line 237
    goto :goto_4

    .line 238
    :cond_b
    invoke-interface {v3, p1}, LB5/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 239
    .line 240
    .line 241
    move-result-object p1

    .line 242
    check-cast p1, Lt/E;

    .line 243
    .line 244
    goto :goto_7

    .line 245
    :cond_c
    :goto_5
    sget v1, LT1/p;->u:I

    .line 246
    .line 247
    invoke-static {v0}, Ln5/A;->u(LT1/p;)LI5/i;

    .line 248
    .line 249
    .line 250
    move-result-object v0

    .line 251
    invoke-interface {v0}, LI5/i;->iterator()Ljava/util/Iterator;

    .line 252
    .line 253
    .line 254
    move-result-object v0

    .line 255
    :cond_d
    :goto_6
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 256
    .line 257
    .line 258
    move-result v1

    .line 259
    if-eqz v1, :cond_f

    .line 260
    .line 261
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 262
    .line 263
    .line 264
    move-result-object v1

    .line 265
    check-cast v1, LT1/p;

    .line 266
    .line 267
    instance-of v2, v1, LU1/h;

    .line 268
    .line 269
    if-eqz v2, :cond_e

    .line 270
    .line 271
    check-cast v1, LU1/h;

    .line 272
    .line 273
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 274
    .line 275
    .line 276
    goto :goto_6

    .line 277
    :cond_e
    instance-of v2, v1, LU1/f;

    .line 278
    .line 279
    if-eqz v2, :cond_d

    .line 280
    .line 281
    check-cast v1, LU1/f;

    .line 282
    .line 283
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 284
    .line 285
    .line 286
    goto :goto_6

    .line 287
    :cond_f
    invoke-interface {v4, p1}, LB5/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 288
    .line 289
    .line 290
    move-result-object p1

    .line 291
    check-cast p1, Lt/E;

    .line 292
    .line 293
    :goto_7
    return-object p1

    .line 294
    nop

    .line 295
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
