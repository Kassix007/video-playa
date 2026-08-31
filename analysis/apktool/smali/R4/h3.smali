.class public final synthetic LR4/h3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic q:I

.field public final synthetic r:Ljava/lang/String;

.field public final synthetic s:Ljava/lang/Object;

.field public final synthetic t:Ljava/lang/Object;

.field public final synthetic u:Ljava/lang/Object;

.field public final synthetic v:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Landroidx/work/Tracer;Ljava/lang/String;LB5/a;Landroidx/lifecycle/J;Landroidx/concurrent/futures/k;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    iput v0, p0, LR4/h3;->q:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LR4/h3;->s:Ljava/lang/Object;

    iput-object p2, p0, LR4/h3;->r:Ljava/lang/String;

    iput-object p3, p0, LR4/h3;->t:Ljava/lang/Object;

    iput-object p4, p0, LR4/h3;->u:Ljava/lang/Object;

    iput-object p5, p0, LR4/h3;->v:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Lcom/web2native/MainActivity;Ljava/lang/String;Ljava/lang/String;LR4/k1;)V
    .locals 1

    .line 2
    const/4 v0, 0x0

    iput v0, p0, LR4/h3;->q:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LR4/h3;->r:Ljava/lang/String;

    iput-object p2, p0, LR4/h3;->u:Ljava/lang/Object;

    iput-object p3, p0, LR4/h3;->s:Ljava/lang/Object;

    iput-object p4, p0, LR4/h3;->t:Ljava/lang/Object;

    iput-object p5, p0, LR4/h3;->v:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 5

    .line 1
    iget v0, p0, LR4/h3;->q:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LR4/h3;->s:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Landroidx/work/Tracer;

    .line 9
    .line 10
    iget-object v1, p0, LR4/h3;->t:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v1, LB5/a;

    .line 13
    .line 14
    iget-object v2, p0, LR4/h3;->u:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v2, Landroidx/lifecycle/J;

    .line 17
    .line 18
    iget-object v3, p0, LR4/h3;->v:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast v3, Landroidx/concurrent/futures/k;

    .line 21
    .line 22
    iget-object v4, p0, LR4/h3;->r:Ljava/lang/String;

    .line 23
    .line 24
    invoke-static {v0, v4, v1, v2, v3}, Landroidx/work/OperationKt;->b(Landroidx/work/Tracer;Ljava/lang/String;LB5/a;Landroidx/lifecycle/J;Landroidx/concurrent/futures/k;)V

    .line 25
    .line 26
    .line 27
    return-void

    .line 28
    :pswitch_0
    iget-object v0, p0, LR4/h3;->u:Ljava/lang/Object;

    .line 29
    .line 30
    check-cast v0, Lcom/web2native/MainActivity;

    .line 31
    .line 32
    iget-object v1, p0, LR4/h3;->s:Ljava/lang/Object;

    .line 33
    .line 34
    check-cast v1, Ljava/lang/String;

    .line 35
    .line 36
    iget-object v2, p0, LR4/h3;->t:Ljava/lang/Object;

    .line 37
    .line 38
    check-cast v2, Ljava/lang/String;

    .line 39
    .line 40
    iget-object v3, p0, LR4/h3;->v:Ljava/lang/Object;

    .line 41
    .line 42
    check-cast v3, LR4/k1;

    .line 43
    .line 44
    iget-object v4, p0, LR4/h3;->r:Ljava/lang/String;

    .line 45
    .line 46
    invoke-static {v4, v0, v1, v2, v3}, LR4/V;->g(Ljava/lang/String;Lcom/web2native/MainActivity;Ljava/lang/String;Ljava/lang/String;LR4/k1;)V

    .line 47
    .line 48
    .line 49
    return-void

    .line 50
    nop

    .line 51
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
