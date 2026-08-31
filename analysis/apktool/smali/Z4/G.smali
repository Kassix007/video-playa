.class public final synthetic LZ4/G;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LB5/c;


# instance fields
.field public final synthetic q:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, LZ4/G;->q:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget v0, p0, LZ4/G;->q:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    sget-object v2, Lm5/y;->a:Lm5/y;

    .line 5
    .line 6
    packed-switch v0, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    check-cast p1, Lu2/g;

    .line 10
    .line 11
    return-object p1

    .line 12
    :pswitch_0
    check-cast p1, Lz0/I;

    .line 13
    .line 14
    return-object v2

    .line 15
    :pswitch_1
    check-cast p1, Lr6/h;

    .line 16
    .line 17
    const-string v0, "it"

    .line 18
    .line 19
    invoke-static {p1, v0}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 23
    .line 24
    return-object p1

    .line 25
    :pswitch_2
    check-cast p1, Lr6/h;

    .line 26
    .line 27
    const-string v0, "entry"

    .line 28
    .line 29
    invoke-static {p1, v0}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    sget-object v0, Lr6/g;->v:Lq6/x;

    .line 33
    .line 34
    iget-object p1, p1, Lr6/h;->a:Lq6/x;

    .line 35
    .line 36
    invoke-static {p1}, Lr6/f;->a(Lq6/x;)Z

    .line 37
    .line 38
    .line 39
    move-result p1

    .line 40
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    return-object p1

    .line 45
    :pswitch_3
    check-cast p1, Ljava/lang/Integer;

    .line 46
    .line 47
    return-object v2

    .line 48
    :pswitch_4
    check-cast p1, Ljava/lang/Long;

    .line 49
    .line 50
    invoke-static {p1}, Landroidx/work/impl/utils/PreferenceUtils;->a(Ljava/lang/Long;)Ljava/lang/Long;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    return-object p1

    .line 55
    :pswitch_5
    check-cast p1, Ljava/util/Map$Entry;

    .line 56
    .line 57
    const-string v0, "<destruct>"

    .line 58
    .line 59
    invoke-static {p1, v0}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    invoke-interface {p1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    check-cast v0, Ljava/lang/String;

    .line 67
    .line 68
    invoke-interface {p1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object p1

    .line 72
    check-cast p1, La6/l;

    .line 73
    .line 74
    new-instance v1, Ljava/lang/StringBuilder;

    .line 75
    .line 76
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 77
    .line 78
    .line 79
    invoke-static {v1, v0}, Lb6/k;->a(Ljava/lang/StringBuilder;Ljava/lang/String;)V

    .line 80
    .line 81
    .line 82
    const/16 v0, 0x3a

    .line 83
    .line 84
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 85
    .line 86
    .line 87
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 88
    .line 89
    .line 90
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 91
    .line 92
    .line 93
    move-result-object p1

    .line 94
    return-object p1

    .line 95
    :pswitch_6
    check-cast p1, LX5/a;

    .line 96
    .line 97
    const-string v0, "$this$buildSerialDescriptor"

    .line 98
    .line 99
    invoke-static {p1, v0}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 100
    .line 101
    .line 102
    new-instance v0, LR4/b2;

    .line 103
    .line 104
    const/16 v1, 0x13

    .line 105
    .line 106
    invoke-direct {v0, v1}, LR4/b2;-><init>(I)V

    .line 107
    .line 108
    .line 109
    new-instance v1, La6/o;

    .line 110
    .line 111
    invoke-direct {v1, v0}, La6/o;-><init>(LB5/a;)V

    .line 112
    .line 113
    .line 114
    const-string v0, "JsonPrimitive"

    .line 115
    .line 116
    invoke-static {p1, v0, v1}, LX5/a;->a(LX5/a;Ljava/lang/String;LX5/f;)V

    .line 117
    .line 118
    .line 119
    new-instance v0, LR4/b2;

    .line 120
    .line 121
    const/16 v1, 0x14

    .line 122
    .line 123
    invoke-direct {v0, v1}, LR4/b2;-><init>(I)V

    .line 124
    .line 125
    .line 126
    new-instance v1, La6/o;

    .line 127
    .line 128
    invoke-direct {v1, v0}, La6/o;-><init>(LB5/a;)V

    .line 129
    .line 130
    .line 131
    const-string v0, "JsonNull"

    .line 132
    .line 133
    invoke-static {p1, v0, v1}, LX5/a;->a(LX5/a;Ljava/lang/String;LX5/f;)V

    .line 134
    .line 135
    .line 136
    new-instance v0, LR4/b2;

    .line 137
    .line 138
    const/16 v1, 0x15

    .line 139
    .line 140
    invoke-direct {v0, v1}, LR4/b2;-><init>(I)V

    .line 141
    .line 142
    .line 143
    new-instance v1, La6/o;

    .line 144
    .line 145
    invoke-direct {v1, v0}, La6/o;-><init>(LB5/a;)V

    .line 146
    .line 147
    .line 148
    const-string v0, "JsonLiteral"

    .line 149
    .line 150
    invoke-static {p1, v0, v1}, LX5/a;->a(LX5/a;Ljava/lang/String;LX5/f;)V

    .line 151
    .line 152
    .line 153
    new-instance v0, LR4/b2;

    .line 154
    .line 155
    const/16 v1, 0x16

    .line 156
    .line 157
    invoke-direct {v0, v1}, LR4/b2;-><init>(I)V

    .line 158
    .line 159
    .line 160
    new-instance v1, La6/o;

    .line 161
    .line 162
    invoke-direct {v1, v0}, La6/o;-><init>(LB5/a;)V

    .line 163
    .line 164
    .line 165
    const-string v0, "JsonObject"

    .line 166
    .line 167
    invoke-static {p1, v0, v1}, LX5/a;->a(LX5/a;Ljava/lang/String;LX5/f;)V

    .line 168
    .line 169
    .line 170
    new-instance v0, LR4/b2;

    .line 171
    .line 172
    const/16 v1, 0x17

    .line 173
    .line 174
    invoke-direct {v0, v1}, LR4/b2;-><init>(I)V

    .line 175
    .line 176
    .line 177
    new-instance v1, La6/o;

    .line 178
    .line 179
    invoke-direct {v1, v0}, La6/o;-><init>(LB5/a;)V

    .line 180
    .line 181
    .line 182
    const-string v0, "JsonArray"

    .line 183
    .line 184
    invoke-static {p1, v0, v1}, LX5/a;->a(LX5/a;Ljava/lang/String;LX5/f;)V

    .line 185
    .line 186
    .line 187
    return-object v2

    .line 188
    :pswitch_7
    check-cast p1, La6/h;

    .line 189
    .line 190
    const-string v0, "$this$Json"

    .line 191
    .line 192
    invoke-static {p1, v0}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 193
    .line 194
    .line 195
    iput-boolean v1, p1, La6/h;->b:Z

    .line 196
    .line 197
    return-object v2

    .line 198
    :pswitch_8
    check-cast p1, Li0/b;

    .line 199
    .line 200
    return-object v2

    .line 201
    :pswitch_9
    check-cast p1, La6/h;

    .line 202
    .line 203
    iput-boolean v1, p1, La6/h;->b:Z

    .line 204
    .line 205
    return-object v2

    .line 206
    nop

    .line 207
    :pswitch_data_0
    .packed-switch 0x0
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
