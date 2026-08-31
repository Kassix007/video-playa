.class public final synthetic LC0/t;
.super Lkotlin/jvm/internal/k;
.source "SourceFile"

# interfaces
.implements LB5/e;


# instance fields
.field public final synthetic q:I


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;II)V
    .locals 0

    .line 1
    iput p7, p0, LC0/t;->q:I

    move-object p7, p4

    move-object p4, p3

    move p3, p6

    move-object p6, p7

    move-object p7, p5

    move-object p5, p2

    move p2, p1

    move-object p1, p0

    invoke-direct/range {p1 .. p7}, Lkotlin/jvm/internal/j;-><init>(IILjava/lang/Class;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    iget v0, p0, LC0/t;->q:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Lh0/n;

    .line 7
    .line 8
    check-cast p2, Lh0/n;

    .line 9
    .line 10
    iget-object v0, p0, Lkotlin/jvm/internal/d;->receiver:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v0, Lv/I;

    .line 13
    .line 14
    iget-boolean v1, v0, Lc0/l;->D:Z

    .line 15
    .line 16
    if-nez v1, :cond_0

    .line 17
    .line 18
    goto/16 :goto_2

    .line 19
    .line 20
    :cond_0
    invoke-virtual {p2}, Lh0/n;->a()Z

    .line 21
    .line 22
    .line 23
    move-result p2

    .line 24
    invoke-virtual {p1}, Lh0/n;->a()Z

    .line 25
    .line 26
    .line 27
    move-result p1

    .line 28
    if-ne p2, p1, :cond_1

    .line 29
    .line 30
    goto/16 :goto_2

    .line 31
    .line 32
    :cond_1
    iget-object p1, v0, Lv/I;->H:LC0/s;

    .line 33
    .line 34
    if-eqz p1, :cond_2

    .line 35
    .line 36
    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    invoke-virtual {p1, v1}, LC0/s;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    :cond_2
    const/4 p1, 0x0

    .line 44
    if-eqz p2, :cond_4

    .line 45
    .line 46
    invoke-virtual {v0}, Lc0/l;->l0()LM5/w;

    .line 47
    .line 48
    .line 49
    move-result-object v1

    .line 50
    new-instance v2, Lv/H;

    .line 51
    .line 52
    invoke-direct {v2, v0, p1}, Lv/H;-><init>(Lv/I;Lq5/c;)V

    .line 53
    .line 54
    .line 55
    const/4 v3, 0x3

    .line 56
    invoke-static {v1, p1, p1, v2, v3}, LM5/y;->t(LM5/w;Lq5/h;LM5/x;LB5/e;I)LM5/B;

    .line 57
    .line 58
    .line 59
    new-instance v1, Lkotlin/jvm/internal/y;

    .line 60
    .line 61
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 62
    .line 63
    .line 64
    new-instance v2, LB0/K;

    .line 65
    .line 66
    const/16 v3, 0x12

    .line 67
    .line 68
    invoke-direct {v2, v1, v0, v3}, LB0/K;-><init>(Lkotlin/jvm/internal/y;Lc0/l;I)V

    .line 69
    .line 70
    .line 71
    invoke-static {v0, v2}, LB0/g;->r(Lc0/l;LB5/a;)V

    .line 72
    .line 73
    .line 74
    iget-object v1, v1, Lkotlin/jvm/internal/y;->q:Ljava/lang/Object;

    .line 75
    .line 76
    check-cast v1, LE/G;

    .line 77
    .line 78
    if-eqz v1, :cond_3

    .line 79
    .line 80
    invoke-virtual {v1}, LE/G;->a()LE/G;

    .line 81
    .line 82
    .line 83
    goto :goto_0

    .line 84
    :cond_3
    move-object v1, p1

    .line 85
    :goto_0
    iput-object v1, v0, Lv/I;->J:LE/G;

    .line 86
    .line 87
    iget-object v1, v0, Lv/I;->K:LB0/n0;

    .line 88
    .line 89
    if-eqz v1, :cond_6

    .line 90
    .line 91
    invoke-virtual {v1}, LB0/n0;->B0()Lc0/l;

    .line 92
    .line 93
    .line 94
    move-result-object v1

    .line 95
    iget-boolean v1, v1, Lc0/l;->D:Z

    .line 96
    .line 97
    if-eqz v1, :cond_6

    .line 98
    .line 99
    invoke-virtual {v0}, Lv/I;->B0()Lv/J;

    .line 100
    .line 101
    .line 102
    move-result-object v1

    .line 103
    if-eqz v1, :cond_6

    .line 104
    .line 105
    iget-object v2, v0, Lv/I;->K:LB0/n0;

    .line 106
    .line 107
    invoke-virtual {v1, v2}, Lv/J;->x0(Lz0/m;)V

    .line 108
    .line 109
    .line 110
    goto :goto_1

    .line 111
    :cond_4
    iget-object v1, v0, Lv/I;->J:LE/G;

    .line 112
    .line 113
    if-eqz v1, :cond_5

    .line 114
    .line 115
    invoke-virtual {v1}, LE/G;->b()V

    .line 116
    .line 117
    .line 118
    :cond_5
    iput-object p1, v0, Lv/I;->J:LE/G;

    .line 119
    .line 120
    invoke-virtual {v0}, Lv/I;->B0()Lv/J;

    .line 121
    .line 122
    .line 123
    move-result-object v1

    .line 124
    if-eqz v1, :cond_6

    .line 125
    .line 126
    invoke-virtual {v1, p1}, Lv/J;->x0(Lz0/m;)V

    .line 127
    .line 128
    .line 129
    :cond_6
    :goto_1
    invoke-static {v0}, LB0/g;->n(LB0/A0;)V

    .line 130
    .line 131
    .line 132
    iget-object v1, v0, Lv/I;->G:Ly/i;

    .line 133
    .line 134
    if-eqz v1, :cond_9

    .line 135
    .line 136
    if-eqz p2, :cond_8

    .line 137
    .line 138
    iget-object p2, v0, Lv/I;->I:Ly/d;

    .line 139
    .line 140
    if-eqz p2, :cond_7

    .line 141
    .line 142
    new-instance v2, Ly/e;

    .line 143
    .line 144
    invoke-direct {v2, p2}, Ly/e;-><init>(Ly/d;)V

    .line 145
    .line 146
    .line 147
    invoke-virtual {v0, v1, v2}, Lv/I;->A0(Ly/i;Ly/h;)V

    .line 148
    .line 149
    .line 150
    iput-object p1, v0, Lv/I;->I:Ly/d;

    .line 151
    .line 152
    :cond_7
    new-instance p1, Ly/d;

    .line 153
    .line 154
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 155
    .line 156
    .line 157
    invoke-virtual {v0, v1, p1}, Lv/I;->A0(Ly/i;Ly/h;)V

    .line 158
    .line 159
    .line 160
    iput-object p1, v0, Lv/I;->I:Ly/d;

    .line 161
    .line 162
    goto :goto_2

    .line 163
    :cond_8
    iget-object p2, v0, Lv/I;->I:Ly/d;

    .line 164
    .line 165
    if-eqz p2, :cond_9

    .line 166
    .line 167
    new-instance v2, Ly/e;

    .line 168
    .line 169
    invoke-direct {v2, p2}, Ly/e;-><init>(Ly/d;)V

    .line 170
    .line 171
    .line 172
    invoke-virtual {v0, v1, v2}, Lv/I;->A0(Ly/i;Ly/h;)V

    .line 173
    .line 174
    .line 175
    iput-object p1, v0, Lv/I;->I:Ly/d;

    .line 176
    .line 177
    :cond_9
    :goto_2
    sget-object p1, Lm5/y;->a:Lm5/y;

    .line 178
    .line 179
    return-object p1

    .line 180
    :pswitch_0
    check-cast p1, LX5/f;

    .line 181
    .line 182
    check-cast p2, Ljava/lang/Number;

    .line 183
    .line 184
    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    .line 185
    .line 186
    .line 187
    move-result p2

    .line 188
    const-string v0, "p0"

    .line 189
    .line 190
    invoke-static {p1, v0}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 191
    .line 192
    .line 193
    iget-object v0, p0, Lkotlin/jvm/internal/d;->receiver:Ljava/lang/Object;

    .line 194
    .line 195
    check-cast v0, Lb6/d;

    .line 196
    .line 197
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 198
    .line 199
    .line 200
    invoke-interface {p1, p2}, LX5/f;->j(I)Z

    .line 201
    .line 202
    .line 203
    move-result v1

    .line 204
    if-nez v1, :cond_a

    .line 205
    .line 206
    invoke-interface {p1, p2}, LX5/f;->i(I)LX5/f;

    .line 207
    .line 208
    .line 209
    move-result-object p1

    .line 210
    invoke-interface {p1}, LX5/f;->g()Z

    .line 211
    .line 212
    .line 213
    move-result p1

    .line 214
    if-eqz p1, :cond_a

    .line 215
    .line 216
    const/4 p1, 0x1

    .line 217
    goto :goto_3

    .line 218
    :cond_a
    const/4 p1, 0x0

    .line 219
    :goto_3
    iput-boolean p1, v0, Lb6/d;->b:Z

    .line 220
    .line 221
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 222
    .line 223
    .line 224
    move-result-object p1

    .line 225
    return-object p1

    .line 226
    :pswitch_1
    check-cast p1, Lh0/c;

    .line 227
    .line 228
    check-cast p2, Li0/c;

    .line 229
    .line 230
    iget-object v0, p0, Lkotlin/jvm/internal/d;->receiver:Ljava/lang/Object;

    .line 231
    .line 232
    check-cast v0, LC0/A;

    .line 233
    .line 234
    invoke-static {v0, p1, p2}, LC0/A;->k(LC0/A;Lh0/c;Li0/c;)Z

    .line 235
    .line 236
    .line 237
    move-result p1

    .line 238
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 239
    .line 240
    .line 241
    move-result-object p1

    .line 242
    return-object p1

    .line 243
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
