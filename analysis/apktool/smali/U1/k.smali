.class public final synthetic LU1/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LB5/c;


# instance fields
.field public final synthetic q:LT1/d;

.field public final synthetic r:Z

.field public final synthetic s:Ljava/util/List;


# direct methods
.method public synthetic constructor <init>(LT1/d;Ljava/util/List;Z)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LU1/k;->q:LT1/d;

    iput-boolean p3, p0, LU1/k;->r:Z

    iput-object p2, p0, LU1/k;->s:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    check-cast p1, LP/F;

    .line 2
    .line 3
    new-instance p1, LU1/l;

    .line 4
    .line 5
    iget-object v0, p0, LU1/k;->q:LT1/d;

    .line 6
    .line 7
    iget-object v1, p0, LU1/k;->s:Ljava/util/List;

    .line 8
    .line 9
    iget-boolean v2, p0, LU1/k;->r:Z

    .line 10
    .line 11
    invoke-direct {p1, v0, v1, v2}, LU1/l;-><init>(LT1/d;Ljava/util/List;Z)V

    .line 12
    .line 13
    .line 14
    iget-object v1, v0, LT1/d;->x:LW1/c;

    .line 15
    .line 16
    iget-object v1, v1, LW1/c;->j:Landroidx/lifecycle/z;

    .line 17
    .line 18
    invoke-virtual {v1, p1}, Landroidx/lifecycle/z;->a(Landroidx/lifecycle/w;)V

    .line 19
    .line 20
    .line 21
    new-instance v1, LA/X;

    .line 22
    .line 23
    const/4 v2, 0x4

    .line 24
    invoke-direct {v1, v2, v0, p1}, LA/X;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    return-object v1
.end method
