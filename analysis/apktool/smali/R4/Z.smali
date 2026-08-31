.class public final synthetic LR4/Z;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LB5/e;


# instance fields
.field public final synthetic q:I

.field public final synthetic r:Ljava/lang/Object;

.field public final synthetic s:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(IILjava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 1
    iput p2, p0, LR4/Z;->q:I

    iput-object p3, p0, LR4/Z;->r:Ljava/lang/Object;

    iput-object p4, p0, LR4/Z;->s:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget v0, p0, LR4/Z;->q:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LR4/Z;->r:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Ljava/util/List;

    .line 9
    .line 10
    iget-object v1, p0, LR4/Z;->s:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v1, LB5/c;

    .line 13
    .line 14
    check-cast p1, LP/o;

    .line 15
    .line 16
    check-cast p2, Ljava/lang/Integer;

    .line 17
    .line 18
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    const/4 p2, 0x1

    .line 22
    invoke-static {p2}, LP/b;->w(I)I

    .line 23
    .line 24
    .line 25
    move-result p2

    .line 26
    invoke-static {v0, v1, p1, p2}, LE3/h;->a(Ljava/util/List;LB5/c;LP/o;I)V

    .line 27
    .line 28
    .line 29
    :goto_0
    sget-object p1, Lm5/y;->a:Lm5/y;

    .line 30
    .line 31
    return-object p1

    .line 32
    :pswitch_0
    iget-object v0, p0, LR4/Z;->r:Ljava/lang/Object;

    .line 33
    .line 34
    check-cast v0, LR4/k1;

    .line 35
    .line 36
    iget-object v1, p0, LR4/Z;->s:Ljava/lang/Object;

    .line 37
    .line 38
    check-cast v1, Ljava/lang/String;

    .line 39
    .line 40
    check-cast p1, LP/o;

    .line 41
    .line 42
    check-cast p2, Ljava/lang/Integer;

    .line 43
    .line 44
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 45
    .line 46
    .line 47
    const/4 p2, 0x1

    .line 48
    invoke-static {p2}, LP/b;->w(I)I

    .line 49
    .line 50
    .line 51
    move-result p2

    .line 52
    invoke-static {v0, v1, p1, p2}, LQ2/g;->g(LR4/k1;Ljava/lang/String;LP/o;I)V

    .line 53
    .line 54
    .line 55
    goto :goto_0

    .line 56
    :pswitch_1
    iget-object v0, p0, LR4/Z;->r:Ljava/lang/Object;

    .line 57
    .line 58
    check-cast v0, LZ4/i;

    .line 59
    .line 60
    iget-object v1, p0, LR4/Z;->s:Ljava/lang/Object;

    .line 61
    .line 62
    check-cast v1, LB5/a;

    .line 63
    .line 64
    check-cast p1, LP/o;

    .line 65
    .line 66
    check-cast p2, Ljava/lang/Integer;

    .line 67
    .line 68
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 69
    .line 70
    .line 71
    const/4 p2, 0x1

    .line 72
    invoke-static {p2}, LP/b;->w(I)I

    .line 73
    .line 74
    .line 75
    move-result p2

    .line 76
    invoke-static {v0, v1, p1, p2}, LZ4/L;->a(LZ4/i;LB5/a;LP/o;I)V

    .line 77
    .line 78
    .line 79
    goto :goto_0

    .line 80
    :pswitch_2
    iget-object v0, p0, LR4/Z;->r:Ljava/lang/Object;

    .line 81
    .line 82
    check-cast v0, LZ4/o;

    .line 83
    .line 84
    iget-object v1, p0, LR4/Z;->s:Ljava/lang/Object;

    .line 85
    .line 86
    check-cast v1, LB5/a;

    .line 87
    .line 88
    check-cast p1, LP/o;

    .line 89
    .line 90
    check-cast p2, Ljava/lang/Integer;

    .line 91
    .line 92
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 93
    .line 94
    .line 95
    const/4 p2, 0x1

    .line 96
    invoke-static {p2}, LP/b;->w(I)I

    .line 97
    .line 98
    .line 99
    move-result p2

    .line 100
    invoke-static {v0, v1, p1, p2}, LZ4/L;->b(LZ4/o;LB5/a;LP/o;I)V

    .line 101
    .line 102
    .line 103
    goto :goto_0

    .line 104
    :pswitch_3
    iget-object v0, p0, LR4/Z;->s:Ljava/lang/Object;

    .line 105
    .line 106
    check-cast v0, Ljava/lang/Integer;

    .line 107
    .line 108
    check-cast p1, LP/o;

    .line 109
    .line 110
    check-cast p2, Ljava/lang/Integer;

    .line 111
    .line 112
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 113
    .line 114
    .line 115
    const/4 p2, 0x1

    .line 116
    invoke-static {p2}, LP/b;->w(I)I

    .line 117
    .line 118
    .line 119
    move-result p2

    .line 120
    iget-object v1, p0, LR4/Z;->r:Ljava/lang/Object;

    .line 121
    .line 122
    invoke-static {v1, v0, p1, p2}, LU4/a;->o(Ljava/util/List;Ljava/lang/Integer;LP/o;I)V

    .line 123
    .line 124
    .line 125
    goto :goto_0

    .line 126
    :pswitch_4
    iget-object v0, p0, LR4/Z;->r:Ljava/lang/Object;

    .line 127
    .line 128
    check-cast v0, LR4/k1;

    .line 129
    .line 130
    iget-object v1, p0, LR4/Z;->s:Ljava/lang/Object;

    .line 131
    .line 132
    check-cast v1, Lj5/b;

    .line 133
    .line 134
    check-cast p1, LP/o;

    .line 135
    .line 136
    check-cast p2, Ljava/lang/Integer;

    .line 137
    .line 138
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 139
    .line 140
    .line 141
    const/4 p2, 0x1

    .line 142
    invoke-static {p2}, LP/b;->w(I)I

    .line 143
    .line 144
    .line 145
    move-result p2

    .line 146
    invoke-static {v0, v1, p1, p2}, LU4/a;->i(LR4/k1;Lj5/b;LP/o;I)V

    .line 147
    .line 148
    .line 149
    goto :goto_0

    .line 150
    :pswitch_5
    iget-object v0, p0, LR4/Z;->r:Ljava/lang/Object;

    .line 151
    .line 152
    check-cast v0, LZ/c;

    .line 153
    .line 154
    iget-object v1, p0, LR4/Z;->s:Ljava/lang/Object;

    .line 155
    .line 156
    check-cast v1, LX/e;

    .line 157
    .line 158
    check-cast p1, LP/o;

    .line 159
    .line 160
    check-cast p2, Ljava/lang/Integer;

    .line 161
    .line 162
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 163
    .line 164
    .line 165
    const/4 p2, 0x1

    .line 166
    invoke-static {p2}, LP/b;->w(I)I

    .line 167
    .line 168
    .line 169
    move-result p2

    .line 170
    invoke-static {v0, v1, p1, p2}, Lcom/google/android/gms/internal/measurement/K1;->b(LZ/c;LX/e;LP/o;I)V

    .line 171
    .line 172
    .line 173
    goto/16 :goto_0

    .line 174
    .line 175
    :pswitch_6
    iget-object v0, p0, LR4/Z;->r:Ljava/lang/Object;

    .line 176
    .line 177
    check-cast v0, Ljava/util/List;

    .line 178
    .line 179
    iget-object v1, p0, LR4/Z;->s:Ljava/lang/Object;

    .line 180
    .line 181
    check-cast v1, Ljava/util/Collection;

    .line 182
    .line 183
    check-cast p1, LP/o;

    .line 184
    .line 185
    check-cast p2, Ljava/lang/Integer;

    .line 186
    .line 187
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 188
    .line 189
    .line 190
    const/4 p2, 0x1

    .line 191
    invoke-static {p2}, LP/b;->w(I)I

    .line 192
    .line 193
    .line 194
    move-result p2

    .line 195
    invoke-static {v0, v1, p1, p2}, Lcom/google/android/gms/internal/measurement/I1;->F(Ljava/util/List;Ljava/util/Collection;LP/o;I)V

    .line 196
    .line 197
    .line 198
    goto/16 :goto_0

    .line 199
    .line 200
    :pswitch_7
    iget-object v0, p0, LR4/Z;->r:Ljava/lang/Object;

    .line 201
    .line 202
    check-cast v0, LR4/V;

    .line 203
    .line 204
    iget-object v1, p0, LR4/Z;->s:Ljava/lang/Object;

    .line 205
    .line 206
    check-cast v1, LB5/c;

    .line 207
    .line 208
    check-cast p1, LP/o;

    .line 209
    .line 210
    check-cast p2, Ljava/lang/Integer;

    .line 211
    .line 212
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 213
    .line 214
    .line 215
    const/4 p2, 0x7

    .line 216
    invoke-static {p2}, LP/b;->w(I)I

    .line 217
    .line 218
    .line 219
    move-result p2

    .line 220
    invoke-virtual {v0, v1, p1, p2}, LR4/V;->e(LB5/c;LP/o;I)V

    .line 221
    .line 222
    .line 223
    goto/16 :goto_0

    .line 224
    .line 225
    :pswitch_8
    iget-object v0, p0, LR4/Z;->r:Ljava/lang/Object;

    .line 226
    .line 227
    check-cast v0, LR4/V;

    .line 228
    .line 229
    iget-object v1, p0, LR4/Z;->s:Ljava/lang/Object;

    .line 230
    .line 231
    check-cast v1, Ljava/lang/String;

    .line 232
    .line 233
    check-cast p1, LP/o;

    .line 234
    .line 235
    check-cast p2, Ljava/lang/Integer;

    .line 236
    .line 237
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 238
    .line 239
    .line 240
    const/4 p2, 0x1

    .line 241
    invoke-static {p2}, LP/b;->w(I)I

    .line 242
    .line 243
    .line 244
    move-result p2

    .line 245
    invoke-virtual {v0, v1, p1, p2}, LR4/V;->a(Ljava/lang/String;LP/o;I)V

    .line 246
    .line 247
    .line 248
    goto/16 :goto_0

    .line 249
    .line 250
    nop

    .line 251
    :pswitch_data_0
    .packed-switch 0x0
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
