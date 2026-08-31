.class public final synthetic Lb/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/lifecycle/v;


# instance fields
.field public final synthetic q:Lb/A;

.field public final synthetic r:Lh/h;


# direct methods
.method public synthetic constructor <init>(Lb/A;Lh/h;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lb/e;->q:Lb/A;

    iput-object p2, p0, Lb/e;->r:Lh/h;

    return-void
.end method


# virtual methods
.method public final e(Landroidx/lifecycle/x;Landroidx/lifecycle/o;)V
    .locals 0

    .line 1
    sget-object p1, Landroidx/lifecycle/o;->ON_CREATE:Landroidx/lifecycle/o;

    .line 2
    .line 3
    if-ne p2, p1, :cond_0

    .line 4
    .line 5
    iget-object p1, p0, Lb/e;->r:Lh/h;

    .line 6
    .line 7
    invoke-static {p1}, Lb/f;->a(Lh/h;)Landroid/window/OnBackInvokedDispatcher;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    iget-object p2, p0, Lb/e;->q:Lb/A;

    .line 12
    .line 13
    iput-object p1, p2, Lb/A;->e:Landroid/window/OnBackInvokedDispatcher;

    .line 14
    .line 15
    iget-boolean p1, p2, Lb/A;->g:Z

    .line 16
    .line 17
    invoke-virtual {p2, p1}, Lb/A;->d(Z)V

    .line 18
    .line 19
    .line 20
    :cond_0
    return-void
.end method
