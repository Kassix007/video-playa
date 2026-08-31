.class public abstract LI0/q;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:LI0/s;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, LI0/s;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    sget-object v2, LI0/o;->D:LI0/o;

    .line 5
    .line 6
    const-string v3, "TestTagsAsResourceId"

    .line 7
    .line 8
    invoke-direct {v0, v3, v1, v2}, LI0/s;-><init>(Ljava/lang/String;ZLB5/e;)V

    .line 9
    .line 10
    .line 11
    sput-object v0, LI0/q;->a:LI0/s;

    .line 12
    .line 13
    return-void
.end method
