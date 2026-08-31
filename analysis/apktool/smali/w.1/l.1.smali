.class public final Lw/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lw/I;


# instance fields
.field public a:Lu/v;

.field public final b:Lw/k0;


# direct methods
.method public constructor <init>(Lu/v;)V
    .locals 1

    .line 1
    sget-object v0, Lw/p0;->b:Lw/k0;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lw/l;->a:Lu/v;

    .line 7
    .line 8
    iput-object v0, p0, Lw/l;->b:Lw/k0;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final a(Lw/C0;FLq5/c;)Ljava/lang/Object;
    .locals 2

    .line 1
    new-instance v0, Lw/k;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, p2, p0, p1, v1}, Lw/k;-><init>(FLw/l;Lw/C0;Lq5/c;)V

    .line 5
    .line 6
    .line 7
    iget-object p1, p0, Lw/l;->b:Lw/k0;

    .line 8
    .line 9
    invoke-static {p1, v0, p3}, LM5/y;->B(Lq5/h;LB5/e;Lq5/c;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    return-object p1
.end method
