.class public final LP/Q;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LP/V0;


# instance fields
.field public final a:Lm5/o;


# direct methods
.method public constructor <init>(LB5/a;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-static {p1}, Lm5/a;->d(LB5/a;)Lm5/o;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    iput-object p1, p0, LP/Q;->a:Lm5/o;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final a(LP/i0;)Ljava/lang/Object;
    .locals 0

    .line 1
    iget-object p1, p0, LP/Q;->a:Lm5/o;

    .line 2
    .line 3
    invoke-virtual {p1}, Lm5/o;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method
