.class public final Le5/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/compose/ui/input/pointer/PointerInputEventHandler;


# instance fields
.field public final synthetic q:I

.field public final synthetic r:Ljava/lang/Object;

.field public final synthetic s:Ljava/lang/Object;

.field public final synthetic t:LB5/a;


# direct methods
.method public synthetic constructor <init>(LR4/k1;Le5/b;LB5/a;I)V
    .locals 0

    .line 1
    iput p4, p0, Le5/e;->q:I

    iput-object p1, p0, Le5/e;->r:Ljava/lang/Object;

    iput-object p2, p0, Le5/e;->s:Ljava/lang/Object;

    iput-object p3, p0, Le5/e;->t:LB5/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(La5/c;LB5/a;LB5/c;)V
    .locals 1

    const/4 v0, 0x2

    iput v0, p0, Le5/e;->q:I

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Le5/e;->r:Ljava/lang/Object;

    iput-object p2, p0, Le5/e;->t:LB5/a;

    iput-object p3, p0, Le5/e;->s:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final invoke(Lv0/o;Lq5/c;)Ljava/lang/Object;
    .locals 6

    .line 1
    iget v0, p0, Le5/e;->q:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Le5/e;->r:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, La5/c;

    .line 9
    .line 10
    iget-object v1, p0, Le5/e;->s:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v1, LB5/c;

    .line 13
    .line 14
    new-instance v2, LR4/y2;

    .line 15
    .line 16
    const/4 v3, 0x3

    .line 17
    iget-object v4, p0, Le5/e;->t:LB5/a;

    .line 18
    .line 19
    invoke-direct {v2, v0, v4, v1, v3}, LR4/y2;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 20
    .line 21
    .line 22
    const/4 v0, 0x7

    .line 23
    const/4 v1, 0x0

    .line 24
    invoke-static {p1, v1, v2, p2, v0}, Lw/g1;->d(Lv0/o;LB5/c;LB5/c;Lq5/c;I)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    sget-object p2, Lr5/a;->q:Lr5/a;

    .line 29
    .line 30
    if-ne p1, p2, :cond_0

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_0
    sget-object p1, Lm5/y;->a:Lm5/y;

    .line 34
    .line 35
    :goto_0
    return-object p1

    .line 36
    :pswitch_0
    iget-object v0, p0, Le5/e;->r:Ljava/lang/Object;

    .line 37
    .line 38
    check-cast v0, LR4/k1;

    .line 39
    .line 40
    iget-object v1, p0, Le5/e;->s:Ljava/lang/Object;

    .line 41
    .line 42
    check-cast v1, Le5/b;

    .line 43
    .line 44
    new-instance v2, Le5/c;

    .line 45
    .line 46
    const/4 v3, 0x2

    .line 47
    iget-object v4, p0, Le5/e;->t:LB5/a;

    .line 48
    .line 49
    invoke-direct {v2, v0, v1, v4, v3}, Le5/c;-><init>(LR4/k1;Le5/b;LB5/a;I)V

    .line 50
    .line 51
    .line 52
    new-instance v3, Le5/c;

    .line 53
    .line 54
    const/4 v5, 0x3

    .line 55
    invoke-direct {v3, v0, v1, v4, v5}, Le5/c;-><init>(LR4/k1;Le5/b;LB5/a;I)V

    .line 56
    .line 57
    .line 58
    const/4 v0, 0x5

    .line 59
    invoke-static {p1, v2, v3, p2, v0}, Lw/g1;->d(Lv0/o;LB5/c;LB5/c;Lq5/c;I)Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    sget-object p2, Lr5/a;->q:Lr5/a;

    .line 64
    .line 65
    if-ne p1, p2, :cond_1

    .line 66
    .line 67
    goto :goto_1

    .line 68
    :cond_1
    sget-object p1, Lm5/y;->a:Lm5/y;

    .line 69
    .line 70
    :goto_1
    return-object p1

    .line 71
    :pswitch_1
    iget-object v0, p0, Le5/e;->r:Ljava/lang/Object;

    .line 72
    .line 73
    check-cast v0, LR4/k1;

    .line 74
    .line 75
    iget-object v1, p0, Le5/e;->s:Ljava/lang/Object;

    .line 76
    .line 77
    check-cast v1, Le5/b;

    .line 78
    .line 79
    new-instance v2, Le5/c;

    .line 80
    .line 81
    const/4 v3, 0x0

    .line 82
    iget-object v4, p0, Le5/e;->t:LB5/a;

    .line 83
    .line 84
    invoke-direct {v2, v0, v1, v4, v3}, Le5/c;-><init>(LR4/k1;Le5/b;LB5/a;I)V

    .line 85
    .line 86
    .line 87
    new-instance v3, Le5/c;

    .line 88
    .line 89
    const/4 v5, 0x1

    .line 90
    invoke-direct {v3, v0, v1, v4, v5}, Le5/c;-><init>(LR4/k1;Le5/b;LB5/a;I)V

    .line 91
    .line 92
    .line 93
    const/4 v0, 0x5

    .line 94
    invoke-static {p1, v2, v3, p2, v0}, Lw/g1;->d(Lv0/o;LB5/c;LB5/c;Lq5/c;I)Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    move-result-object p1

    .line 98
    sget-object p2, Lr5/a;->q:Lr5/a;

    .line 99
    .line 100
    if-ne p1, p2, :cond_2

    .line 101
    .line 102
    goto :goto_2

    .line 103
    :cond_2
    sget-object p1, Lm5/y;->a:Lm5/y;

    .line 104
    .line 105
    :goto_2
    return-object p1

    .line 106
    nop

    .line 107
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
