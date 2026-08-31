.class public final LZ0/i;
.super Lkotlin/jvm/internal/n;
.source "SourceFile"

# interfaces
.implements LB5/a;


# instance fields
.field public final synthetic q:I

.field public final synthetic r:LZ0/r;


# direct methods
.method public synthetic constructor <init>(LZ0/r;I)V
    .locals 0

    .line 1
    iput p2, p0, LZ0/i;->q:I

    iput-object p1, p0, LZ0/i;->r:LZ0/r;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 4

    .line 1
    iget v0, p0, LZ0/i;->q:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LZ0/i;->r:LZ0/r;

    .line 7
    .line 8
    iget-object v1, v0, LZ0/r;->P:Landroid/view/View;

    .line 9
    .line 10
    invoke-virtual {v0}, LZ0/r;->getUpdateBlock()LB5/c;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-interface {v0, v1}, LB5/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    sget-object v0, Lm5/y;->a:Lm5/y;

    .line 18
    .line 19
    return-object v0

    .line 20
    :pswitch_0
    iget-object v0, p0, LZ0/i;->r:LZ0/r;

    .line 21
    .line 22
    iget-object v1, v0, LZ0/r;->P:Landroid/view/View;

    .line 23
    .line 24
    invoke-virtual {v0}, LZ0/r;->getResetBlock()LB5/c;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    invoke-interface {v0, v1}, LB5/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    sget-object v0, Lm5/y;->a:Lm5/y;

    .line 32
    .line 33
    return-object v0

    .line 34
    :pswitch_1
    iget-object v0, p0, LZ0/i;->r:LZ0/r;

    .line 35
    .line 36
    iget-object v1, v0, LZ0/r;->P:Landroid/view/View;

    .line 37
    .line 38
    invoke-virtual {v0}, LZ0/r;->getReleaseBlock()LB5/c;

    .line 39
    .line 40
    .line 41
    move-result-object v2

    .line 42
    invoke-interface {v2, v1}, LB5/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    invoke-static {v0}, LZ0/r;->o(LZ0/r;)V

    .line 46
    .line 47
    .line 48
    sget-object v0, Lm5/y;->a:Lm5/y;

    .line 49
    .line 50
    return-object v0

    .line 51
    :pswitch_2
    new-instance v0, Landroid/util/SparseArray;

    .line 52
    .line 53
    invoke-direct {v0}, Landroid/util/SparseArray;-><init>()V

    .line 54
    .line 55
    .line 56
    iget-object v1, p0, LZ0/i;->r:LZ0/r;

    .line 57
    .line 58
    iget-object v1, v1, LZ0/r;->P:Landroid/view/View;

    .line 59
    .line 60
    invoke-virtual {v1, v0}, Landroid/view/View;->saveHierarchyState(Landroid/util/SparseArray;)V

    .line 61
    .line 62
    .line 63
    return-object v0

    .line 64
    :pswitch_3
    iget-object v0, p0, LZ0/i;->r:LZ0/r;

    .line 65
    .line 66
    iget-boolean v1, v0, LZ0/j;->u:Z

    .line 67
    .line 68
    if-eqz v1, :cond_0

    .line 69
    .line 70
    invoke-virtual {v0}, Landroid/view/View;->isAttachedToWindow()Z

    .line 71
    .line 72
    .line 73
    move-result v1

    .line 74
    if-eqz v1, :cond_0

    .line 75
    .line 76
    invoke-virtual {v0}, LZ0/j;->getView()Landroid/view/View;

    .line 77
    .line 78
    .line 79
    move-result-object v1

    .line 80
    invoke-virtual {v1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 81
    .line 82
    .line 83
    move-result-object v1

    .line 84
    if-ne v1, v0, :cond_0

    .line 85
    .line 86
    invoke-static {v0}, LZ0/j;->k(LZ0/r;)LB0/v0;

    .line 87
    .line 88
    .line 89
    move-result-object v1

    .line 90
    sget-object v2, LZ0/b;->r:LZ0/b;

    .line 91
    .line 92
    invoke-virtual {v0}, LZ0/j;->getUpdate()LB5/a;

    .line 93
    .line 94
    .line 95
    move-result-object v3

    .line 96
    invoke-virtual {v1, v0, v2, v3}, LB0/v0;->a(LB0/u0;LB5/c;LB5/a;)V

    .line 97
    .line 98
    .line 99
    :cond_0
    sget-object v0, Lm5/y;->a:Lm5/y;

    .line 100
    .line 101
    return-object v0

    .line 102
    :pswitch_4
    iget-object v0, p0, LZ0/i;->r:LZ0/r;

    .line 103
    .line 104
    invoke-virtual {v0}, LZ0/j;->getLayoutNode()LB0/L;

    .line 105
    .line 106
    .line 107
    move-result-object v0

    .line 108
    invoke-virtual {v0}, LB0/L;->A()V

    .line 109
    .line 110
    .line 111
    sget-object v0, Lm5/y;->a:Lm5/y;

    .line 112
    .line 113
    return-object v0

    .line 114
    nop

    .line 115
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
