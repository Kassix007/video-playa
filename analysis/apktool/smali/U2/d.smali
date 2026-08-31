.class public final LU2/d;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Landroid/content/Context;

.field public b:LU2/e;

.field public c:Ljava/lang/Object;

.field public final d:Ljava/util/Map;

.field public final e:LB5/c;

.field public final f:LB5/c;

.field public final g:LB5/c;

.field public h:LV2/i;

.field public i:LV2/g;

.field public j:LV2/d;

.field public k:Ljava/lang/Object;


# direct methods
.method public constructor <init>(LU2/g;Landroid/content/Context;)V
    .locals 1

    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 14
    iput-object p2, p0, LU2/d;->a:Landroid/content/Context;

    .line 15
    iget-object p2, p1, LU2/g;->s:LU2/e;

    .line 16
    iput-object p2, p0, LU2/d;->b:LU2/e;

    .line 17
    iget-object p2, p1, LU2/g;->b:Ljava/lang/Object;

    .line 18
    iput-object p2, p0, LU2/d;->c:Ljava/lang/Object;

    .line 19
    iget-object p2, p1, LU2/g;->c:Ljava/util/Map;

    .line 20
    iput-object p2, p0, LU2/d;->d:Ljava/util/Map;

    .line 21
    iget-object p2, p1, LU2/g;->r:LU2/f;

    .line 22
    iget-object v0, p2, LU2/f;->a:LB5/c;

    .line 23
    iput-object v0, p0, LU2/d;->e:LB5/c;

    .line 24
    iget-object v0, p2, LU2/f;->b:LB5/c;

    .line 25
    iput-object v0, p0, LU2/d;->f:LB5/c;

    .line 26
    iget-object v0, p2, LU2/f;->c:LB5/c;

    .line 27
    iput-object v0, p0, LU2/d;->g:LB5/c;

    .line 28
    iget-object v0, p2, LU2/f;->d:LV2/i;

    .line 29
    iput-object v0, p0, LU2/d;->h:LV2/i;

    .line 30
    iget-object v0, p2, LU2/f;->e:LV2/g;

    .line 31
    iput-object v0, p0, LU2/d;->i:LV2/g;

    .line 32
    iget-object p2, p2, LU2/f;->f:LV2/d;

    .line 33
    iput-object p2, p0, LU2/d;->j:LV2/d;

    .line 34
    iget-object p1, p1, LU2/g;->q:LI2/m;

    .line 35
    iput-object p1, p0, LU2/d;->k:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lcom/web2native/MainActivity;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, LU2/d;->a:Landroid/content/Context;

    .line 3
    sget-object p1, LU2/e;->o:LU2/e;

    iput-object p1, p0, LU2/d;->b:LU2/e;

    const/4 p1, 0x0

    .line 4
    iput-object p1, p0, LU2/d;->c:Ljava/lang/Object;

    .line 5
    sget-object v0, Ln5/t;->q:Ln5/t;

    iput-object v0, p0, LU2/d;->d:Ljava/util/Map;

    .line 6
    sget-object v0, LY2/i;->q:LY2/i;

    iput-object v0, p0, LU2/d;->e:LB5/c;

    .line 7
    iput-object v0, p0, LU2/d;->f:LB5/c;

    .line 8
    iput-object v0, p0, LU2/d;->g:LB5/c;

    .line 9
    iput-object p1, p0, LU2/d;->h:LV2/i;

    .line 10
    iput-object p1, p0, LU2/d;->i:LV2/g;

    .line 11
    iput-object p1, p0, LU2/d;->j:LV2/d;

    .line 12
    sget-object p1, LI2/m;->b:LI2/m;

    iput-object p1, p0, LU2/d;->k:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final a()LU2/g;
    .locals 27

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, LU2/d;->c:Ljava/lang/Object;

    .line 4
    .line 5
    if-nez v1, :cond_0

    .line 6
    .line 7
    sget-object v1, LU2/l;->a:LU2/l;

    .line 8
    .line 9
    :cond_0
    move-object v4, v1

    .line 10
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 11
    .line 12
    iget-object v2, v0, LU2/d;->d:Ljava/util/Map;

    .line 13
    .line 14
    invoke-static {v2, v1}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    if-eqz v1, :cond_1

    .line 19
    .line 20
    const-string v1, "null cannot be cast to non-null type kotlin.collections.MutableMap<*, *>"

    .line 21
    .line 22
    invoke-static {v2, v1}, Lkotlin/jvm/internal/m;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    invoke-static {v2}, Lkotlin/jvm/internal/B;->a(Ljava/lang/Object;)Ljava/util/Map;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    invoke-static {v1}, Ln5/A;->F(Ljava/util/Map;)Ljava/util/Map;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    :goto_0
    move-object v5, v2

    .line 34
    goto :goto_1

    .line 35
    :cond_1
    if-eqz v2, :cond_a

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :goto_1
    const-string v1, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String>"

    .line 39
    .line 40
    invoke-static {v5, v1}, Lkotlin/jvm/internal/m;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    iget-object v1, v0, LU2/d;->b:LU2/e;

    .line 44
    .line 45
    iget-object v6, v1, LU2/e;->a:Lq6/l;

    .line 46
    .line 47
    iget-object v10, v1, LU2/e;->e:LU2/b;

    .line 48
    .line 49
    iget-object v11, v1, LU2/e;->f:LU2/b;

    .line 50
    .line 51
    iget-object v12, v1, LU2/e;->g:LU2/b;

    .line 52
    .line 53
    iget-object v7, v1, LU2/e;->b:Lq5/h;

    .line 54
    .line 55
    iget-object v8, v1, LU2/e;->c:Lq5/h;

    .line 56
    .line 57
    iget-object v9, v1, LU2/e;->d:Lq5/h;

    .line 58
    .line 59
    iget-object v2, v0, LU2/d;->e:LB5/c;

    .line 60
    .line 61
    if-nez v2, :cond_2

    .line 62
    .line 63
    iget-object v2, v1, LU2/e;->h:LB5/c;

    .line 64
    .line 65
    :cond_2
    move-object v13, v2

    .line 66
    iget-object v2, v0, LU2/d;->f:LB5/c;

    .line 67
    .line 68
    if-nez v2, :cond_3

    .line 69
    .line 70
    iget-object v2, v1, LU2/e;->i:LB5/c;

    .line 71
    .line 72
    :cond_3
    move-object v14, v2

    .line 73
    iget-object v2, v0, LU2/d;->g:LB5/c;

    .line 74
    .line 75
    if-nez v2, :cond_4

    .line 76
    .line 77
    iget-object v2, v1, LU2/e;->j:LB5/c;

    .line 78
    .line 79
    :cond_4
    move-object v15, v2

    .line 80
    iget-object v2, v0, LU2/d;->h:LV2/i;

    .line 81
    .line 82
    if-nez v2, :cond_5

    .line 83
    .line 84
    iget-object v2, v1, LU2/e;->k:LV2/i;

    .line 85
    .line 86
    :cond_5
    move-object/from16 v16, v2

    .line 87
    .line 88
    iget-object v2, v0, LU2/d;->i:LV2/g;

    .line 89
    .line 90
    if-nez v2, :cond_6

    .line 91
    .line 92
    iget-object v2, v1, LU2/e;->l:LV2/g;

    .line 93
    .line 94
    :cond_6
    move-object/from16 v17, v2

    .line 95
    .line 96
    iget-object v2, v0, LU2/d;->j:LV2/d;

    .line 97
    .line 98
    if-nez v2, :cond_7

    .line 99
    .line 100
    iget-object v2, v1, LU2/e;->m:LV2/d;

    .line 101
    .line 102
    :cond_7
    move-object/from16 v18, v2

    .line 103
    .line 104
    iget-object v1, v0, LU2/d;->k:Ljava/lang/Object;

    .line 105
    .line 106
    instance-of v2, v1, LI2/k;

    .line 107
    .line 108
    if-eqz v2, :cond_8

    .line 109
    .line 110
    check-cast v1, LI2/k;

    .line 111
    .line 112
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 113
    .line 114
    .line 115
    new-instance v2, LI2/m;

    .line 116
    .line 117
    iget-object v1, v1, LI2/k;->a:Ljava/util/LinkedHashMap;

    .line 118
    .line 119
    invoke-static {v1}, Ln5/A;->F(Ljava/util/Map;)Ljava/util/Map;

    .line 120
    .line 121
    .line 122
    move-result-object v1

    .line 123
    invoke-direct {v2, v1}, LI2/m;-><init>(Ljava/util/Map;)V

    .line 124
    .line 125
    .line 126
    :goto_2
    move-object/from16 v19, v2

    .line 127
    .line 128
    goto :goto_3

    .line 129
    :cond_8
    instance-of v2, v1, LI2/m;

    .line 130
    .line 131
    if-eqz v2, :cond_9

    .line 132
    .line 133
    move-object v2, v1

    .line 134
    check-cast v2, LI2/m;

    .line 135
    .line 136
    goto :goto_2

    .line 137
    :goto_3
    iget-object v1, v0, LU2/d;->h:LV2/i;

    .line 138
    .line 139
    iget-object v2, v0, LU2/d;->i:LV2/g;

    .line 140
    .line 141
    iget-object v3, v0, LU2/d;->j:LV2/d;

    .line 142
    .line 143
    new-instance v20, LU2/f;

    .line 144
    .line 145
    move-object/from16 v24, v1

    .line 146
    .line 147
    iget-object v1, v0, LU2/d;->e:LB5/c;

    .line 148
    .line 149
    move-object/from16 v21, v1

    .line 150
    .line 151
    iget-object v1, v0, LU2/d;->f:LB5/c;

    .line 152
    .line 153
    move-object/from16 v22, v1

    .line 154
    .line 155
    iget-object v1, v0, LU2/d;->g:LB5/c;

    .line 156
    .line 157
    move-object/from16 v23, v1

    .line 158
    .line 159
    move-object/from16 v25, v2

    .line 160
    .line 161
    move-object/from16 v26, v3

    .line 162
    .line 163
    invoke-direct/range {v20 .. v26}, LU2/f;-><init>(LB5/c;LB5/c;LB5/c;LV2/i;LV2/g;LV2/d;)V

    .line 164
    .line 165
    .line 166
    iget-object v1, v0, LU2/d;->b:LU2/e;

    .line 167
    .line 168
    new-instance v2, LU2/g;

    .line 169
    .line 170
    iget-object v3, v0, LU2/d;->a:Landroid/content/Context;

    .line 171
    .line 172
    move-object/from16 v21, v1

    .line 173
    .line 174
    invoke-direct/range {v2 .. v21}, LU2/g;-><init>(Landroid/content/Context;Ljava/lang/Object;Ljava/util/Map;Lq6/l;Lq5/h;Lq5/h;Lq5/h;LU2/b;LU2/b;LU2/b;LB5/c;LB5/c;LB5/c;LV2/i;LV2/g;LV2/d;LI2/m;LU2/f;LU2/e;)V

    .line 175
    .line 176
    .line 177
    return-object v2

    .line 178
    :cond_9
    new-instance v1, Ljava/lang/AssertionError;

    .line 179
    .line 180
    invoke-direct {v1}, Ljava/lang/AssertionError;-><init>()V

    .line 181
    .line 182
    .line 183
    throw v1

    .line 184
    :cond_a
    new-instance v1, Ljava/lang/AssertionError;

    .line 185
    .line 186
    invoke-direct {v1}, Ljava/lang/AssertionError;-><init>()V

    .line 187
    .line 188
    .line 189
    throw v1
.end method
