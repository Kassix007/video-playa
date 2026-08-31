.class public final synthetic Landroidx/work/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/concurrent/futures/l;


# instance fields
.field public final synthetic q:Ljava/util/concurrent/Executor;

.field public final synthetic r:Landroidx/work/Tracer;

.field public final synthetic s:Ljava/lang/String;

.field public final synthetic t:LB5/a;

.field public final synthetic u:Landroidx/lifecycle/J;


# direct methods
.method public synthetic constructor <init>(Ljava/util/concurrent/Executor;Landroidx/work/Tracer;Ljava/lang/String;LB5/a;Landroidx/lifecycle/J;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/work/d;->q:Ljava/util/concurrent/Executor;

    iput-object p2, p0, Landroidx/work/d;->r:Landroidx/work/Tracer;

    iput-object p3, p0, Landroidx/work/d;->s:Ljava/lang/String;

    iput-object p4, p0, Landroidx/work/d;->t:LB5/a;

    iput-object p5, p0, Landroidx/work/d;->u:Landroidx/lifecycle/J;

    return-void
.end method


# virtual methods
.method public final b(Landroidx/concurrent/futures/k;)Ljava/lang/Object;
    .locals 6

    .line 1
    iget-object v3, p0, Landroidx/work/d;->t:LB5/a;

    iget-object v4, p0, Landroidx/work/d;->u:Landroidx/lifecycle/J;

    iget-object v0, p0, Landroidx/work/d;->q:Ljava/util/concurrent/Executor;

    iget-object v1, p0, Landroidx/work/d;->r:Landroidx/work/Tracer;

    iget-object v2, p0, Landroidx/work/d;->s:Ljava/lang/String;

    move-object v5, p1

    invoke-static/range {v0 .. v5}, Landroidx/work/OperationKt;->a(Ljava/util/concurrent/Executor;Landroidx/work/Tracer;Ljava/lang/String;LB5/a;Landroidx/lifecycle/J;Landroidx/concurrent/futures/k;)Lm5/y;

    move-result-object p1

    return-object p1
.end method
