.class public final synthetic Lf5/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LB5/f;


# instance fields
.field public final synthetic q:F

.field public final synthetic r:F

.field public final synthetic s:LR4/x;


# direct methods
.method public synthetic constructor <init>(FFLR4/x;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lf5/c;->q:F

    iput p2, p0, Lf5/c;->r:F

    iput-object p3, p0, Lf5/c;->s:LR4/x;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 23

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    check-cast v1, LA/u;

    .line 6
    .line 7
    move-object/from16 v2, p2

    .line 8
    .line 9
    check-cast v2, LP/o;

    .line 10
    .line 11
    move-object/from16 v3, p3

    .line 12
    .line 13
    check-cast v3, Ljava/lang/Integer;

    .line 14
    .line 15
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 16
    .line 17
    .line 18
    move-result v3

    .line 19
    const-string v4, "$this$Card"

    .line 20
    .line 21
    invoke-static {v1, v4}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    and-int/lit8 v1, v3, 0x11

    .line 25
    .line 26
    const/16 v4, 0x10

    .line 27
    .line 28
    const/4 v5, 0x1

    .line 29
    if-eq v1, v4, :cond_0

    .line 30
    .line 31
    move v1, v5

    .line 32
    goto :goto_0

    .line 33
    :cond_0
    const/4 v1, 0x0

    .line 34
    :goto_0
    and-int/2addr v3, v5

    .line 35
    invoke-virtual {v2, v3, v1}, LP/o;->K(IZ)Z

    .line 36
    .line 37
    .line 38
    move-result v1

    .line 39
    if-eqz v1, :cond_2

    .line 40
    .line 41
    sget-object v1, Landroidx/compose/foundation/layout/c;->a:Landroidx/compose/foundation/layout/FillElement;

    .line 42
    .line 43
    iget v3, v0, Lf5/c;->q:F

    .line 44
    .line 45
    iget v4, v0, Lf5/c;->r:F

    .line 46
    .line 47
    invoke-static {v1, v3, v4}, Landroidx/compose/foundation/layout/b;->b(Lc0/m;FF)Lc0/m;

    .line 48
    .line 49
    .line 50
    move-result-object v3

    .line 51
    iget-object v1, v0, Lf5/c;->s:LR4/x;

    .line 52
    .line 53
    iget-object v4, v1, LR4/x;->e:Ljava/lang/String;

    .line 54
    .line 55
    iget-object v1, v1, LR4/x;->f:Ljava/lang/String;

    .line 56
    .line 57
    if-nez v4, :cond_1

    .line 58
    .line 59
    const-string v4, "Btn Text"

    .line 60
    .line 61
    :cond_1
    new-instance v18, LL0/F;

    .line 62
    .line 63
    invoke-static {v1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 64
    .line 65
    .line 66
    move-result v5

    .line 67
    invoke-static {v5}, Lj0/B;->b(I)J

    .line 68
    .line 69
    .line 70
    move-result-wide v6

    .line 71
    const-wide/16 v13, 0x0

    .line 72
    .line 73
    const v15, 0xfffffe

    .line 74
    .line 75
    .line 76
    const-wide/16 v8, 0x0

    .line 77
    .line 78
    const/4 v10, 0x0

    .line 79
    const-wide/16 v11, 0x0

    .line 80
    .line 81
    move-object/from16 v5, v18

    .line 82
    .line 83
    invoke-direct/range {v5 .. v15}, LL0/F;-><init>(JJLO0/j;JJI)V

    .line 84
    .line 85
    .line 86
    invoke-static {v1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 87
    .line 88
    .line 89
    move-result v1

    .line 90
    invoke-static {v1}, Lj0/B;->b(I)J

    .line 91
    .line 92
    .line 93
    move-result-wide v5

    .line 94
    new-instance v11, LV0/k;

    .line 95
    .line 96
    const/4 v1, 0x3

    .line 97
    invoke-direct {v11, v1}, LV0/k;-><init>(I)V

    .line 98
    .line 99
    .line 100
    const/16 v21, 0xc00

    .line 101
    .line 102
    const v22, 0xddf8

    .line 103
    .line 104
    .line 105
    move-object/from16 v19, v2

    .line 106
    .line 107
    move-object v2, v4

    .line 108
    move-wide v4, v5

    .line 109
    const-wide/16 v6, 0x0

    .line 110
    .line 111
    const/4 v8, 0x0

    .line 112
    const-wide/16 v9, 0x0

    .line 113
    .line 114
    const-wide/16 v12, 0x0

    .line 115
    .line 116
    const/4 v14, 0x0

    .line 117
    const/4 v15, 0x0

    .line 118
    const/16 v16, 0x2

    .line 119
    .line 120
    const/16 v17, 0x0

    .line 121
    .line 122
    const/16 v20, 0x0

    .line 123
    .line 124
    invoke-static/range {v2 .. v22}, LM/N0;->b(Ljava/lang/String;Lc0/m;JJLO0/j;JLV0/k;JIZIILL0/F;LP/o;III)V

    .line 125
    .line 126
    .line 127
    goto :goto_1

    .line 128
    :cond_2
    move-object/from16 v19, v2

    .line 129
    .line 130
    invoke-virtual/range {v19 .. v19}, LP/o;->N()V

    .line 131
    .line 132
    .line 133
    :goto_1
    sget-object v1, Lm5/y;->a:Lm5/y;

    .line 134
    .line 135
    return-object v1
.end method
